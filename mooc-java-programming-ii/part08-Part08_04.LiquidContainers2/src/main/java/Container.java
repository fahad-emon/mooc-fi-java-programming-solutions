public class Container {
    
    private int mxLimit;
    private int amountOfLq;

    public Container(){
        this.amountOfLq = 0;
        this.mxLimit = 100;
    }

    public int contains(){
        return this.amountOfLq;
    }

    public void add(int amount){
        if (amount < 0 ) {
            return;
        }
        if (amount + this.amountOfLq >= this.mxLimit) {
            this.amountOfLq = mxLimit; return;
        }
        this.amountOfLq += amount;
    }

    public void remove(int amount){
        if (amount < 0) {
            return;
        }
        if(amount > this.amountOfLq ){
            this.amountOfLq = 0; return;
        }
        this.amountOfLq -= amount;
    }

    

    public String toString(){
        return this.amountOfLq+ "/" + this.mxLimit;
    }
}
