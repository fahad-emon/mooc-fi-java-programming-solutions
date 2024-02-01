public class Container {
	 
    private int liquid;
    private int mxCapacity;
 
    public Container(){
        this.liquid = 0;
        this.mxCapacity = 100;
    }
    // which returns the amount of liquid in a container as an integer.
    public int contains(){
        return this.liquid;
    }
    // which adds the amount of liquid given as a parameter to the container.
    // If the amount is negative, no liquid is added. A container can hold 
    // a maximum of 100 units of liquid.
    public void add(int amount){
 
        if (amount < 0) {
            return;
        }
        if(this.liquid + amount <= this.mxCapacity ){
            this.liquid += amount;
        }else{
            this.liquid = this.mxCapacity;
        }
    }
    // which removes the amount of liquid given as a parameter from the container.
    //  If the amount is negative, no liquid is removed. 
    // A container can never hold less than 0 units of liquid.
    public void remove(int amount){
        if (amount < 0) {
            return;
        }
        if(amount > this.liquid ){
            this.liquid = 0;
        }else{
            this.liquid -= amount;
        }
    }
    // which returns the container as a string 
    // formatted "amount of liquid/100, for example "32/100".
    public String toString(){
        return this.liquid + "/" +this.mxCapacity;
    }
 
}