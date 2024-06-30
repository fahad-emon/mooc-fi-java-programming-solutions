public class ProductWarehouseWithHistory extends ProductWarehouse{

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        super.addToWarehouse(initialBalance);
    }

    public void printAnalysis(){
        System.out.println("Product: "+super.getName());
        System.out.println("History: "+super.history());
        System.out.println("Largest amount of product: "+super.maxValue());
        System.out.println("Smallest amount of product: "+super.minValue());
        System.out.println("Average: "+super.average());
    }

}
