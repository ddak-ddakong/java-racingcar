package step3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

public class RacingCarTest {
    
    private RacingCar racingCar;

    @BeforeEach
    void setUp() {
        racingCar = RacingCar.newInstanceByCarMove(3, 5);
    }
    
    @Test
    @DisplayName("step3. ù ��° ���� ���� �׽�Ʈ")
    public void testFirstRound() {
        assertThat(RacingCondition.isFirstRound(0)).isTrue();
    }
    
    @Test
    @DisplayName("step3. ������ �������� �׽�Ʈ")
    public void testRandomMove() {
        assertThat(RacingCondition.isMoveForward()).isTrue();
    }

    @ValueSource(ints = {0, 1, 2})
    @DisplayName("step3. ���� �̵�")
    public void testMoveForward(int carIndex) {
        assertThat(RacingUtils.moveForward(racingCar, carIndex, 0)).isEqualTo("-");
    }
    
    @Test
    @DisplayName("step3. 2ȸ�� �̵� �׽�Ʈ")
    public void testSingleRound() {
        RacingUtils.goSingleRound(racingCar, 1);
    }
    
    @Test
    @DisplayName("step3. �ڵ��� ���� �׽�Ʈ")
    public void testFullRound() {
        RacingUtils.goFullRace(racingCar);
    }
}