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

	private final String REGEX_EXPRESSION = "[0-9]*( [-+*/] [0-9]*)*";
	
	private	final int MIN_EXPRESSION_LENGTH = 1;
	
	private String expression;
	
	public int calculate(String expression) {
		checkInputValueValidation(expression);
		
		this.expression = expression.trim();
		return calculate();
	}
	
	private int calculate() {
		int result = 0;		//�����
		int value1 = 0;		//������ ���� ���ڰ�
		String sign = "";	//�����ȣ

		String[] expValues = expression.split(" ");
		result = Integer.parseInt(expValues[0]); 
		
		int valuesIndex = 1;
		while ( valuesIndex <= expValues.length - 2 ) {
			sign = expValues[valuesIndex];
			value1 = Integer.parseInt(expValues[valuesIndex + 1]);
			
			result = CalculatorTypeEnum.getCalculatorBySign(sign).calculate(result, value1);
			
			valuesIndex = valuesIndex + 2;
		}
		
		return result;
	}
	
	public void checkInputValueValidation(String input) {
		//1. �Է°��� null�̰ų� �� ���� ���ڿ��� ��� IllegalArgumentException throw
		if( StringUtils.isBlank(input) || input.trim().length() < MIN_EXPRESSION_LENGTH ) {
			throw new IllegalArgumentException("�Է°� ���� ���� (null Ȥ�� ����)");
		}
		
		//2. ���Ŀ��� �� ���ڿ� ���̿� ������ �ִ�.
		if( !input.matches(REGEX_EXPRESSION) ) {
			throw new IllegalArgumentException("�Է½� ���� ���� (ex. 3 + 1 / 10)");
		}
	}
}
