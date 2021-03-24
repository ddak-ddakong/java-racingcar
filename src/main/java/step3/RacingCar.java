package step3;

import java.util.ArrayList;
import java.util.List;

/**
 * STEP3. �ڵ��� ����
 * 
 * 1. �Է°�   : ���� ��, �̵� Ƚ��
 * 2. �������� : 0 ~ 9 ������ ������ �߻��Ͽ� 4�̻��� ���
 * 
 * @author ddak-ddakong
 *
 */
public class RacingCar {
    
    private List<Car> cars;                         //����
    private int roundCount;                         //�̵� Ƚ��
    
    public RacingCar(int carCount, int roundCount) {
        this.roundCount = roundCount;
        this.cars = new ArrayList<Car>();
        
        for( int index = 0 ; index < carCount ; index++ ) {
            this.cars.add(index, new Car());
        }
    }
    
    public int getTotalRound() {
        return this.roundCount;
    }
    
    public int getTotalCarCount() {
        return this.cars.size();
    }

    public Car getCarByIndex(int index) {
        return cars.get(index);
    }
    
    public void raceSingleRound() {
        for( int cIndex = 0 ; cIndex < getTotalCarCount() ; cIndex++ ) {
            getCarByIndex(cIndex).move(RacingCondition.isMoveForward());
        }
    }
}    
