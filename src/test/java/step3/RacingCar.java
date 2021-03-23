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
    
    public int totalRound() {
        return this.roundCount;
    }
    
    public int totalCarCount() {
        return this.cars.size();
    }

    public Car carByIndex(int index) {
        return cars.get(index);
    }
    
    public void racing() {
        for( int rIndex = 0 ; rIndex < roundCount ; rIndex++ ) {
            for( int cIndex = 0 ; cIndex < totalCarCount() ; cIndex++ ) {
                carByIndex(cIndex).move();
            }
        }
    }
}    
