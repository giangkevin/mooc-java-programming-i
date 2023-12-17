
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals
    private static final double affordablePrice = 2.50;
    private static final double heartyPrice = 4.30;


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000.0;
    }

    public double eatAffordably(double payment) {
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if(payment >= affordablePrice){
            affordableMeals++;
            this.money = this.money + affordablePrice;
            return payment - affordablePrice;
        }
        return payment;
    }

    public double eatHeartily(double payment) {
        // a hearty meal costs 4.30 euros
        // increase the amount of cash by the price of a hearty mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        if (payment >= heartyPrice){
            heartyMeals++;
            this.money = this.money + heartyPrice;
            return payment-heartyPrice;
            
        }
        return payment;
    }

    public boolean eatAffordably(PaymentCard card){
        if(card.balance() >= affordablePrice){
            card.takeMoney(affordablePrice);
            affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card){
        if (card.balance() >= heartyPrice){
            card.takeMoney(heartyPrice);
            heartyMeals++;
            return true;
        }
        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum){
        if (sum >= 0 ){
            card.addMoney(sum);
            money += sum;
        }
    }


    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
