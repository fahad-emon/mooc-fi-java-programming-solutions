package application;

public class StandardSensor implements Sensor{

    private int value;

    public StandardSensor(int value){
        this.value = value;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public int read() {
        return this.value;
    }

    @Override
    public void setOff() {
        
        
    }

    @Override
    public void setOn() {
        
        
    }

    
    
}
