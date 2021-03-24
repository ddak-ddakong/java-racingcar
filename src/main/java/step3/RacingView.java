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
    
    public void printPosition(Car car) {
        for( int rIndex = 0 ; rIndex < car.position() ; rIndex++ ) {
            System.out.print(CAR_MOVEMENT);
        }
        System.out.println();
    }

    public void resultView(RacingCar racingInfo) {

        System.out.println("\n���� ���");
        
        if( racingInfo == null ) {
            return ;
        }
        
        Car currentCar;
        for( int rIndex = 0 ; rIndex < racingInfo.totalRound() ; rIndex++ ) {
            for( int cIndex = 0 ; cIndex < racingInfo.totalCarCount() ; cIndex++ ) {
                currentCar = racingInfo.carByIndex(cIndex);
                currentCar.move();
                printPosition(currentCar);
            }
            System.out.println();
        }
        System.out.println();
    }
}
