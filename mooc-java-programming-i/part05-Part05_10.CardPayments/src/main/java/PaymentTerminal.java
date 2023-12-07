
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        final double price =2.50;
        
        if (payment < price) {
            return payment;
        }
        this.money = this.money + price;
        affordableMeals++;
        return payment - price;
    }

    public double eatHeartily(double payment) {
        final double price =4.30;
        
        if (payment < price) {
            return payment;
        }
        this.money = this.money + price;
        heartyMeals++;
        return payment - price;
    }

    public boolean eatAffordably(PaymentCard card) {
        final double price = 2.50;
        
        if (card.takeMoney(price)) {
            affordableMeals++;
            return true;
        }
        
        return false;
    }
    
    public boolean eatHeartily(PaymentCard card) {
        final double price = 4.30;
        
        if (card.takeMoney(price)) {
            heartyMeals++;
            return true;
        }
        
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;            
        }
    }
    
    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
