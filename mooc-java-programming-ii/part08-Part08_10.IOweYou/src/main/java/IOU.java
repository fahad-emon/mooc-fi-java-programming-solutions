import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> iou;

    public IOU(){
        this.iou = new HashMap<>();
    }

    public void setSum(String toWhom, double amount){
        this.iou.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom){
        for (String key : this.iou.keySet()) {
            if (key.contains(toWhom)) {
                return this.iou.get(key).doubleValue();
            }
        }
        return 0.00;
    }
}
