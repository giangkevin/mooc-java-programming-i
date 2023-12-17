
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

    public Money plus(Money addition){
        Money newMoney = new  Money(this.euros + addition.euros, this.cents + addition.cents);

        return newMoney;
    }

    public boolean lessThan(Money compared){
        if (this == compared ){
            return true;
        }

        if (!(compared instanceof Money)){
            return false;
        }

        if (this.euros < compared.euros){
            return true;
        }

        if (this.euros == compared.euros){
            if (this.cents < compared.cents){
                return true;
            }
        }

        return false;

    }

    public Money minus (Money decreaser){
        int e = this.euros - decreaser.euros;
        int c = this.cents - decreaser.cents;
        if (e >= 0){
            if (c < 0){
                c += 100;
                e -= 1;
            }
        } else{
            e = 0;
            c = 0;
        }

        Money f = new Money(e, c);
         
        return f;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
