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
        for( int rIndex = 0 ; rIndex < round ; rIndex++ ) {
            System.out.print(car.getPosition(rIndex) ? CAR_MOVEMENT : "");
        }
        System.out.println();
    }

    public void resultView(RacingCar racingInfo) {

        System.out.println("\n���� ���");
        
        if( racingInfo == null ) {
            return ;
        }

        for( int rIndex = 0 ; rIndex < racingInfo.getRoundCount() ; rIndex++ ) {
            for( int cIndex = 0 ; cIndex < racingInfo.getCarCount() ; cIndex++ ) {
                printCarPosition(racingInfo.getCarByIndexNumber(cIndex), rIndex);
            }
        }
        System.out.println();
    }
}
