package step3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

public class RacingCarTest {
    
    private RacingCar racingCar;

    @Test
    @DisplayName("step3. ������ �������� �׽�Ʈ")
    public void testRandomMove() {
        assertThat(RacingCondition.isMoveForward()).isTrue();
    }

    @ValueSource(ints = {0, 1, 2})
    @DisplayName("step3. ���� �̵�")
    public void testMoveForward(int carIndex) {
        Car car = racingCar.carByIndex(carIndex);
        car.move();
        assertThat(car.position()).isBetween(0, 1);
    }
    
    @Test
    @DisplayName("step3. ��ü �ڵ��� ���� ����")
    public void testRacing() {
        racingCar = new RacingCar(3, 5);
        racingCar.racing();
        for( int index = 0 ; index < racingCar.totalCarCount() ; index++ ) {
            assertThat(racingCar.carByIndex(index).position()).isGreaterThan(1);
        }
    }
    
}