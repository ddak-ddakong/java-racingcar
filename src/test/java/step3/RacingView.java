package step3;

import java.util.Scanner;

public class RacingView {

    private static final String CAR_MOVEMENT = "-";        //������ �̵�ǥ��
    
    Scanner scanner;
    
    public RacingView() {
        scanner = new Scanner(System.in);
    }
    
    public int inputCarCountView() {
        System.out.println("�ڵ��� ����� �� �� �ΰ���?");
        return scanner.nextInt();
    }
    
    public int inputRacingRoundView() {
        System.out.println("�õ��� ȸ���� �� ȸ �ΰ���?");
        return scanner.nextInt();
    }
    
    public void printCarPosition(Car car, int round) {
        for( int index = 0 ; index < car.getPosition(round) ; index++ ) {
            System.out.print(CAR_MOVEMENT);
        }
        System.out.println();
    }

    public void resultView(RacingCar racingInfo) {

        System.out.println("\n���� ���");
        
        if( racingInfo == null ) {
            return ;
        }
        
        for( int moveCount = 0 ; moveCount < racingInfo.getRoundCount() ; moveCount++ ) {
            for( int carIndex = 0 ; carIndex < racingInfo.getCarCount() ; carIndex++ ) {
                printCarPosition(racingInfo.getCarByIndexNumber(carIndex), moveCount);
            }
            System.out.println();
        }
    }
}
