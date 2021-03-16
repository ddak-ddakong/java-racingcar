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

    public void addCar(Car racingCar) {
        this.cars.add(racingCar);
    }

    public List<Car> getCars() {
        return this.cars;
    }
    
    public Car getCarByIndexNumber(int index) {
        return this.cars.get(index);
    }
    
    public int getCarCount() {
        return this.cars.size();
    }

    public void setRoundCount(int roundCount) {
        this.roundCount = roundCount;
    }
    
    public int getRoundCount() {
        return this.roundCount;
    }
}    
