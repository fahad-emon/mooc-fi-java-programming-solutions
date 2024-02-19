import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {
    private HashMap<String,ArrayList<String>>storage;

    public StorageFacility(){
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item){
        this.storage.putIfAbsent(unit, new ArrayList<>());
        ArrayList<String> items = this.storage.get(unit);
        items.add(item);
    }

    public ArrayList<String> contents(String storageUnit){
        if (!this.storage.containsKey(storageUnit)) {
            ArrayList<String>emptyList = new ArrayList<>();
            return emptyList;
        }
        return this.storage.get(storageUnit);
    }

    public void remove(String storageUnit, String item){
        ArrayList<String>units = this.storage.get(storageUnit);
        if (units.contains(item)) {
            units.remove(item);
        }
        if (units.isEmpty()) {
            this.storage.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits(){
        ArrayList<String> units = new ArrayList<>();
        for (String unit : this.storage.keySet()) {
            units.add(unit);
        }
        return units;
    }

}
