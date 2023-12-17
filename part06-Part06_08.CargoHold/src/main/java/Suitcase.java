import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight){
        this.maximumWeight = maximumWeight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item){

        if(item.getWeight() + totalWeight() <= this.maximumWeight){
            this.items.add(item);
        }
        
    }


    public int totalWeight(){

        int total = 0 ; 
        int index = 0 ;

        while (index < this.items.size()){
            total += this.items.get(index).getWeight();
            index++;
        }

        return total;
    }

    public void printItems(){
        for(Item items : this.items){
            System.out.println(items);
        }
    }

    public Item heaviestItem(){
        if (this.items.isEmpty()){
            return null;
        }

        Item returnItem = this.items.get(0);

        for (Item items : items){
            if (returnItem.getWeight() <= items.getWeight()){
                returnItem = items;
            }
        }

        return returnItem;
    }
    
    public String toString(){
        if (items.isEmpty()){
            return "no items (0 kg)" ;
        }

        if (items.size() == 1){
            return "1 item (" + this.items.get(0).getWeight() + " kg)";
        }

        return items.size() + " items (" + totalWeight() + " kg)";

    }
}