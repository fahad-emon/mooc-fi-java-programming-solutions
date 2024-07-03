public class Person implements Saveable{
    private String name;
    private String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    @Override
    public void delete() {
        
    }

    @Override
    public void load(String address) {
       
    }

    @Override
    public void save() {
        
    }
    
}
