
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here

        PaymentTerminal unicafeExactum = new PaymentTerminal();
        System.out.println(unicafeExactum);

        PaymentCard anessCard = new PaymentCard(2);
        
        System.out.println("amount of money on the card is " +anessCard.balance() + "euros");

        boolean wasSuccessful = unicafeExactum.eatHeartily(anessCard);
        System.out.println("there was enough money: " +wasSuccessful);

        unicafeExactum.addMoneyToCard(anessCard, 100);

        wasSuccessful = unicafeExactum.eatHeartily(anessCard);
        System.out.println("there was enough money: " + wasSuccessful);

        System.out.println("amount of money on the card is " +anessCard.balance() + "euros");

        System.out.println(unicafeExactum);


    }
}

