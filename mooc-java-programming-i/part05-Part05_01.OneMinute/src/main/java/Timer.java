public class Timer {
    private ClockHand hours;
    private ClockHand minutes;
    private ClockHand seconds;
    private ClockHand hdsOfSec;    

    public Timer(){
        this.hours = new ClockHand(24);
        this.minutes = new ClockHand(60);
        this.seconds = new ClockHand(60);
        this.hdsOfSec = new ClockHand(100);
    }

    public void advance() {
        this.hdsOfSec.advance();
        if(this.hdsOfSec.value()==0){
            this.seconds.advance();
            if (this.seconds.value() == 0) {
                this.minutes.advance();

                if (this.minutes.value() == 0) {
                    this.hours.advance();
                }
            }
        }
    }

    public String toString() {
        return seconds+":"+hdsOfSec;
    }
}
