package step3;

import java.util.Scanner;

public class RacingView {

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

    public void resultView(String[][] racingInfo) {

        System.out.println("\n���� ���");
        
        if( racingInfo == null ) {
            return ;
        }
        
        for( int moveCount = 0 ; moveCount < racingInfo.length ; moveCount++ ) {
            for( int carIndex = 0 ; carIndex < racingInfo[moveCount].length ; carIndex++ ) {
                System.out.println(racingInfo[carIndex][moveCount]);
            }
            System.out.println();
        }
    }
}
