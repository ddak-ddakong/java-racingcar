package step3;

import java.util.Random;
import java.util.Scanner;

/**
 * STEP3. �ڵ��� ����
 * 
 * 1. �Է°�   : ���� ��, �̵� Ƚ��
 * 2. �������� : 0 ~ 9 ������ ������ �ٷ����Ͽ� 4�̻��� ���
 * 
 * @author ddak-ddakong
 *
 */
public class RacingCar {
    private final int MAX_RANDOM_NUMBER = 10;       //������ �ִ� �ٿ��
    private final int MOVE_CONDITION_NUMBER = 4;    //������ �̵�����
    private final int FIRST_ROUND_NUMBR = 0;        //ù ���� �ε���
    private final String CAR_MOVEMENT = "-";        //������ �̵�ǥ��
    
    private int carInput;                           //���� ��
    private int roundCount;                          //�̵� Ƚ��
    private String[][] racingCar;                   //������ �̵�����
    
    private Random random;
    
    private static RacingCar instance;
    
    private RacingCar() {
        random = new Random();
    }
    
    private RacingCar(int carCount, int roundCount) {
        this.carInput = carCount;
        this.roundCount = roundCount;
        
        _initRacingInfo();
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
    
    private boolean _isFirstRound(int roundIndex) {
        return roundIndex == FIRST_ROUND_NUMBR ? true : false;
    }
    
    private void _initRacingInfo() {
        racingCar = new String[carInput][roundCount];
    }
    
    public void inputView() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("�ڵ��� ����� �� �� �ΰ���?");
        carInput = scanner.nextInt();
        System.out.println("�õ��� ȸ���� �� ȸ �ΰ���?");
        roundCount = scanner.nextInt();
        
        scanner.close();
        
        _initRacingInfo();
    }
    
    public void resultView() {
        System.out.println("\n���� ���");
        
        for( int moveCount = 0 ; moveCount < roundCount ; moveCount++ ) {
            for( int carIndex = 0 ; carIndex < carInput ; carIndex++ ) {
                System.out.println(racingCar[carIndex][moveCount]);
            }
            System.out.println();
        }
    }
    
    public boolean isMoveForward() {
        if( random.nextInt(MAX_RANDOM_NUMBER) >= MOVE_CONDITION_NUMBER ) {
            return true;
        }
        return false;
    }
    
    public void goSingleRound(int roundIndex) {
        for( int carIndex = 0 ; carIndex < carInput ; carIndex++ ) {

            if( _isFirstRound(roundIndex) ) {
                racingCar[carIndex][roundIndex] = CAR_MOVEMENT;
                continue;
            }

            racingCar[carIndex][roundIndex] = racingCar[carIndex][roundIndex - 1];
            
            if( isMoveForward() ) {
                racingCar[carIndex][roundIndex] += CAR_MOVEMENT;
            }
        }        
    }

    public void goFullRace() {
        for( int moveCount = 0 ; moveCount < roundCount ; moveCount++ ) {
            goSingleRound(moveCount);
        }
    }
}
