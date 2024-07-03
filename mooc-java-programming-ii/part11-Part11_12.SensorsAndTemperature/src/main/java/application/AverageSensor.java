package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> degrees;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.degrees = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        return this.sensors.stream().allMatch(sensor -> sensor.isOn());
    }

    @Override
    public int read() {
        if (this.sensors.isEmpty() || !isOn()) {
            throw new IllegalStateException("Sensors are not working");
        }
        int degree = (int)this.sensors.stream().mapToInt(sensor -> sensor.read()).average().getAsDouble();
        this.degrees.add(degree);
        return degree;
    }

    public List<Integer> readings(){
        return this.degrees.stream().collect(Collectors.toList());
    }

    @Override
    public void setOff() {
        this.sensors.stream().forEach(sensor -> sensor.setOff());
    }

    @Override
    public void setOn() {
        this.sensors.stream().forEach(sensor -> sensor.setOn());
    }

}
