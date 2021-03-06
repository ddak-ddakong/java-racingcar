package step2;

import org.junit.platform.commons.util.StringUtils;

/**
 * <pre>
 * step2 ��Ģ���� ����
 * 
 * 1. ����ڰ� �Է��� ���ڿ� ���� ���� ��Ģ������ ������ �� �ִ� ���⸦ �����ؾ� �Ѵ�.
 * 2. �Է� ���ڿ��� ���ڿ� ��Ģ ���� ���̿��� �ݵ�� �� ���� ���ڿ��� �ִٰ� �����Ѵ�.
 * 3. �������� ��� ��� ���� ������ �������� ������ �����Ѵ�.
 * 4. ���ڿ� ����� ��Ģ������ ��� �켱������ �ƴ� �Է� ���� ���� ��� ������ �����ȴ�. 
 *    ��, ���п����� ����, �������� ����, ���� ���� ���� ����ؾ� ������ �̸� �����Ѵ�.
 *    ���� ��� 2 + 3 * 4 / 2�� ���� ���ڿ��� �Է��� ��� 2 + 3 * 4 / 2 ���� ����� 10�� ����ؾ� �Ѵ�.
 * 
 * </pre>
 * 
 * @author ddak-ddakong
 */
public class ArithmeticOperationsCalculator {

	//�Է� ������� ������ ���� ����ǥ����
	private final String REGEX_EXPRESSION = "[0-9]*( [-+*/] [0-9]*)*";
	
	public int calculate(String expression) {
		
		//TODO �и�
		//1. �Էµ� ������� ���ռ� ����
		checkInputValueValidation(expression);
		
		//2. ��� ó��
		//2.1. ������ �������� split�Ͽ� ���� & ��ȣ �и�
		String[] splitValues = expression.split(" ");
		
		//2.2. �и��� ������ ��ȣ�� ���� ����
		int result = 0;		//�����
		int value1 = 0;		//������ ���� ���ڰ�
		String sign = "";	//�����ȣ
		
		//���ʿ��� ������� ù ��° ������ ���� 
		result = Integer.parseInt(splitValues[0]); 
		
		//�ݺ����� �����Ͽ� ���� ����
		int valuesIndex = 1;
		while ( valuesIndex <= splitValues.length - 2 ) {
			
			sign = splitValues[valuesIndex];
			value1 = Integer.parseInt(splitValues[valuesIndex + 1]);
			
			switch(sign) {
			case "+": result = add(result, value1);			break;
			case "-": result = minus(result, value1);		break;
			case "/": result = devide(result, value1);		break;
			case "*": result = multiply(result, value1);	break;
			}
			
			valuesIndex = valuesIndex + 2;
		}
		
		return result;
	}
	
	public int add(int param1, int param2) {
		return param1 + param2;
	}
	
	public int minus(int param1, int param2) {
		return param1 - param2;
	}
	
	public int multiply(int param1, int param2) {
		return param1 * param2;
	}
	
	public int devide(int param1, int param2) {
		return param1 / param2;
	}
	
	public void checkInputValueValidation(String input) {
		//1. �Է°��� null�̰ų� �� ���� ���ڿ��� ��� IllegalArgumentException throw
		if( StringUtils.isBlank(input) || input.trim().length() < 1 ) {
			throw new IllegalArgumentException("�Է°� ���� ���� (null Ȥ�� ����)");
		}
		
		//2. ���Ŀ��� �� ���ڿ� ���̿� ������ �ִ�.
		if( !input.matches(REGEX_EXPRESSION) ) {
			throw new IllegalArgumentException("�Է½� ���� ���� (ex. 3 + 1 / 10)");
		}
	}
}
