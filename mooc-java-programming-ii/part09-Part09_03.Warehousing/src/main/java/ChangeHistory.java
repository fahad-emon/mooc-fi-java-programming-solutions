import java.util.ArrayList;

public class ChangeHistory {
    
    private ArrayList<Double> changeHistory ;

    public ChangeHistory(){
        this.changeHistory = new ArrayList<>();
    }

    public void add(double status){
        this.changeHistory.add(status);
    }

    public void clear(){
        this.changeHistory.clear();
    }

    public double maxValue(){
        if (this.changeHistory.isEmpty()) {
            return 0.00;
        }
        double mxValue = this.changeHistory.get(0);
        for(double amount : this.changeHistory){
            if (amount>mxValue) {
                mxValue = amount;
            }
        }
        return mxValue;
    }

    public double minValue(){
        if (this.changeHistory.isEmpty()) {
            return 0.00;
        }
        double minValue = this.changeHistory.get(0);
        for(double amount : this.changeHistory){
            if (amount<minValue) {
                minValue = amount;
            }
        }
        return minValue;
    }

    public double average(){
        if (this.changeHistory.isEmpty()) {
            return 0.00;
        }
        double value = 0.0;
        for(double amount : this.changeHistory){
            value += amount;
        }
        return (double)value / this.changeHistory.size(); 
    }

    public String toString(){
        return  "" + this.changeHistory;
    }
}
