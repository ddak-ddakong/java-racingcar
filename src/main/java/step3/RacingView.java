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
    
    public void resultView(RacingCar racingInfo) {

        System.out.println("\n���� ���");
        
        if( racingInfo == null ) {
            return ;
        }
        
        Car currentCar;
        for( int rIndex = 0 ; rIndex < racingInfo.getTotalRound() ; rIndex++ ) {
            racingInfo.raceSingleRound();
            
            for( int cIndex = 0 ; cIndex < racingInfo.getTotalCarCount() ; cIndex++ ) {
                currentCar = racingInfo.getCarByIndex(cIndex);
                System.out.println(CAR_MOVEMENT.repeat(currentCar.getPosition()));
            }
            System.out.println();
        }
        System.out.println();
    }
}
