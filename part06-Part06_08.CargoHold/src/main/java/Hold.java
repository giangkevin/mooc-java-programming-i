import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> list;

    public Hold(int maximumWeight){
        this.maximumWeight = maximumWeight;
        this.list = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        if (suitcase.totalWeight() + holdTotalWeight() <= this.maximumWeight ){
            this.list.add(suitcase);
        }
    }

    public int holdTotalWeight(){
        int totalWeight = 0;

        for (Suitcase suitcase : list){
            totalWeight += suitcase.totalWeight();
        }

        return totalWeight;
    }

    public void printItems(){
        for (Suitcase suitcases : list){
            suitcases.printItems();
        }
    }

    public String toString(){

        if (this.list.size() == 1){
            return this.list.size() +  " suitcase (" + this.list.get(0).totalWeight() + " kg)";

        }

        return this.list.size() + " suitcases (" + holdTotalWeight() + " kg)";
        
    }
}
