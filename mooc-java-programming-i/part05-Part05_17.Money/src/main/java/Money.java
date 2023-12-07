
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros+addition.euros,this.cents+addition.cents);
        return newMoney;
    }

    public Money minus(Money decreaser){
    
        if ( this.lessThan(decreaser) ) {
            return new Money(0,0);
        }
        
        int remainingCents = 0;
        int remainingEuros = 0; 
        if ( decreaser.cents > this.cents && this.euros != 0 ) {
            remainingCents = (100 + this.cents) - decreaser.cents;
            remainingEuros = (this.euros - decreaser.euros) - 1; 
        }else{
            remainingCents = this.cents - decreaser.cents;
            remainingEuros = this.euros - decreaser.euros ; 
        }
        
        return new Money(remainingEuros,remainingCents);
    }

    public boolean lessThan(Money compared){
        if(this.euros < compared.euros){
            return true;
        }else if(this.euros == compared.euros && this.cents < compared.cents){
            return true;
        }
        return false;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
