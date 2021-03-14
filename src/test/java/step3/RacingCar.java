package step3;

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
    
    private int carCount;                           //���� ��
    private int roundCount;                         //�̵� Ƚ��
    private String[][] racingCar;                   //������ �̵�����
    
    private static RacingCar instance;
    
    private RacingCar() {}
    
    private RacingCar(int carCount, int roundCount) {
        this.carCount = carCount;
        this.roundCount = roundCount;
        this.racingCar = new String[carCount][roundCount];
    }
    
    public static RacingCar newInstance() {
        if( instance == null ) {
            instance = new RacingCar();
        }
        return instance;
    }

    public static RacingCar newInstanceByCarMove(int carCount, int roundCount) {
        if( instance == null ) {
            instance = new RacingCar(carCount, roundCount);
        }
        return instance;
    }

    public void setRacingCar(String[][] racingCar) {
        this.racingCar = racingCar;
    }

    public static void setInstance(RacingCar instance) {
        RacingCar.instance = instance;
    }

    public void setCarCount(int carCount) {
        this.carCount = carCount;
    }

    public void setRoundCount(int roundCount) {
        this.roundCount = roundCount;
    }
    
    public int getCarCount() {
        return this.carCount;
    }
    
    public int getRoundCount() {
        return this.roundCount;
    }

    public void setCurrentPosition(int carIndex, int roundIndex, String position) {
        this.racingCar[carIndex][roundIndex] = position;
    }
    
    public String getCurrentPosition(int carIndex, int roundIndex) {
        return racingCar[carIndex][roundIndex];
    }
    
    public String[][] getRacingCarInfo() {
        return racingCar;
    }

}    
