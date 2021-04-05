package step3;

public class Car {
    
    private final int MAXLENGTH_OF_NAME = 5; 
    
    private String name;
    private int move;
    
    public Car() {}
    
    public Car(String name) throws Exception {
        checkNameValidation(name);
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) throws Exception {
        checkNameValidation(name);
        this.name = name;
    }

    public int getPosition() {
        return this.move;
    }
    
    public void move(boolean isMoveForward) {
        if( isMoveForward ) {
            this.move++;
        }
    }
    
    private void checkNameValidation(String name) throws Exception {
        if( name == null || name.isEmpty() ) {
            throw new IllegalStateException("������ ���Է� ����");
        } 
        
        if( name.length() > MAXLENGTH_OF_NAME ) {
            throw new IllegalStateException(name + " ������ ���� ����(�ִ���� : " + MAXLENGTH_OF_NAME + ")");
        }
    }
    
    public boolean isEqualPosition(int position) {
        return position == getPosition();
    }
    
}
