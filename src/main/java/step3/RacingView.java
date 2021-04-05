package step3;

import java.util.List;
import java.util.Scanner;

public class RacingView {

    private static final String CAR_MOVEMENT = "-";
    private static final String DELIMITER = ",";
    
    Scanner scanner;
    
    public RacingView() {
        scanner = new Scanner(System.in);
    }
    
    public String[] inputCarNamesView() {
        System.out.println("������ �ڵ��� �̸��� �Է��ϼ���(�̸��� ��ǥ(,)�� �������� ����).");
        String carNames = scanner.next();
        
        return carNames.split(DELIMITER);
    }
    
    public int inputRacingRoundView() {
        System.out.println("�õ��� ȸ���� ��ȸ�ΰ���?");
        return scanner.nextInt();
    }
    
    public void printBeforRace() {
        System.out.println("\n���� ��� : ");
    }
    
    public void printCurrentRound(RacingCar racingInfo) {
        Car currentCar;
        for( int cIndex = 0 ; cIndex < racingInfo.getTotalCarCount() ; cIndex++ ) {
            currentCar = racingInfo.getCarByIndex(cIndex);
            System.out.println(currentCar.getName() + " : " + CAR_MOVEMENT.repeat(currentCar.getPosition()));
        }
        System.out.println();
    }
    
    public void printWinner(RacingCar racingInfo) {
        StringBuilder builder = new StringBuilder();
        
        List<Car> winners = racingInfo.getWinner();
        for( int cIndex = 0 ; cIndex < winners.size() ; cIndex++ ) {
            builder.append(winners.get(cIndex).getName());
            builder.append(cIndex + 1 < winners.size() ? ", " : ""); 
        }
        System.out.println(builder.toString() + "�� ���� ����߽��ϴ�.");
    }
}
