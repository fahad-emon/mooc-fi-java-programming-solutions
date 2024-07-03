package application;

import java.util.Random;

public class TemperatureSensor implements Sensor{

   private boolean isOn;

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public int read() {
        if (isOn()) {
            return new Random().nextInt((30 - (-30)) + 1) + (-30);
        } else {
            throw new IllegalStateException("The sensor is off!");
        }
    }

    @Override
    public void setOff() {
        this.isOn = false;
    }

    @Override
    public void setOn() {
        this.isOn = true;
    }

    

    
    
}
