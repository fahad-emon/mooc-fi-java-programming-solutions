import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate,String> cars;

    public VehicleRegistry(){
        this.cars = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner){
        if(!this.cars.containsKey(licensePlate)){
            this.cars.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public String get(LicensePlate licensePlate){
        return this.cars.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate){
        if(this.cars.containsKey(licensePlate)){
            this.cars.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates(){
        for (LicensePlate licensePlate : this.cars.keySet()){
            System.out.println(licensePlate);
        }
    }

    public void printOwners(){
        ArrayList<String> uniqueNames = new ArrayList<>();

        for (LicensePlate licensePlate : this.cars.keySet()) {
            if (!uniqueNames.contains(this.cars.get(licensePlate))) {
                uniqueNames.add(this.cars.get(licensePlate));
            }
        }

        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}
