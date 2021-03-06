package step2;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

public class ArithmeticOperationsCalculatorTest {
	
	private List<String> testValues;
	private ArithmeticOperationsCalculator calulator;
		
	@BeforeEach
	void setUp() {
		calulator = new ArithmeticOperationsCalculator();
		
		testValues = new ArrayList<String>();
		testValues.add("2 + 3 * 4 / 2");
		testValues.add("2 + 3 * 4 / 2");
		testValues.add(" 2 + 3 * 4 / 2");
		testValues.add("2+3*4/2");
		testValues.add("9 / 2 + 3 * 7 - 10:");
		testValues.add("2 - 19 * 4");
	}
	
	@ValueSource(ints = {0, 1, 2, 3, 4})
	@DisplayName("step2. �������� �Է��� ���ռ� üũ �׽�Ʈ")
	void inputValidationTest(int index) {
		assertThatThrownBy(() -> { calulator.checkInputValueValidation(testValues.get(index)); })
		                  .hasMessage("IllegalArgumentException")
		                  .hasNoCause();
	}
	
	@Test
	@DisplayName("step2. ���ϱ� ���� �׽�Ʈ")
	void addTest() {
		assertThat(calulator.add(10, 10)).isEqualTo(20);
	}
	
	@Test
	@DisplayName("step2. ���� ���� �׽�Ʈ")
	void minusTest() {
		assertThat(calulator.minus(0, 19)).isEqualTo(-19);
	}
	
	@Test
	@DisplayName("step2. ���ϱ� ���� �׽�Ʈ")
	void multiplyTest() {
		assertThat(calulator.multiply(10, -2)).isEqualTo(-20);
	}
	
	@Test
	@DisplayName("step2. ������ �����׽�Ʈ")
	void devideTest() {
		assertThat(calulator.devide(0, 10)).isEqualTo(0);
	}
	
	@ValueSource(ints = {10, 9, 39, -68})
	@DisplayName("step2. ��Ģ���� ����� �䱸���׿� �°� ��ȯ�Ǵ��� �׽�Ʈ")
	void calculaterTest(String expression, int expect) {
		assertThat(calulator.calculate(expression)).isEqualTo(expect);
	}
}
