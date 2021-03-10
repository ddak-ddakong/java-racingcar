package step3;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RacingCarTest {
    
    private RacingCar racingCar;

    @BeforeEach
    void setUp() {
        racingCar = RacingCar.newInstanceByCarMove(3, 5);
    }
    
    @Test
    @DisplayName("step3. ������ �������� �׽�Ʈ")
    public void testRandomMove() {
        assertThat(racingCar.isMoveForward()).isTrue();
    }
    
    @Test
    @DisplayName("step3. 1ȸ�� �̵� �׽�Ʈ")
    public void testSingleRound() {
        racingCar.goSingleRound(0);
    }
    
    @Test
    @DisplayName("step3. �ڵ��� ���� �׽�Ʈ")
    public void testFullRound() {
        racingCar.goFullRace();
    }
}