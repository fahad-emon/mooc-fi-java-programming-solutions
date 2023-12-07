public class Counter {

    private int counter;
    public Counter(int startValue){
        this.counter = startValue;
    }
    public Counter(){
        this(0);
    }

    public int value(){
        return this.counter;
    }
    public void increase(){
        this.counter = this.counter + 1;
    }
    public void decrease(){
        this.counter = this.counter -1;
    }

    public void increase(int increaseBy){
        while(increaseBy > 0){
            increase();
            increaseBy = increaseBy -1;
        }
    }
    public void decrease(int decreaseBy){
        while(decreaseBy > 0 ){
            decrease();
            decreaseBy = decreaseBy - 1;
        }
    }
}
