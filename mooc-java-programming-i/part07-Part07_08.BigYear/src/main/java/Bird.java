public class Bird {

    private String name;
    private String latinName;
    private int observation;

    public Bird() {
        this.name = "";
        this.latinName = "";
        this.observation = 0;
    }

    public Bird(String name,String latinName) {
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }

    public Bird(String name,String latinName,int observation) {
        this.name = name;
        this.latinName = latinName;
        this.observation = observation;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLatinName(String latinName){
        this.latinName = name;
    }

    public void setObservation(int observation){
        this.observation = observation;
    }
    
    public void increaseObservation(){
        this.observation++;
    }

    public String getName(){
        return this.name;
    }

    public String getLatinName(){
        return this.latinName;
    }

    private int getObservation(){
        return this.observation;
    }
    @Override
    public String toString() {
        return this.name + " (" + this.latinName + "): "
             + this.observation + " observations";
    }
}
