
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString(){
        
        if (elements.isEmpty()){
            return "The collection " + this.name + " is empty.";
        }

        int index = 0;

        while (index < elements.size()){
            index++;
        }
        

       String outputs = "The collection " + this.name + " has " + index + " elements:";
       String output = "The collection " + this.name + " has " + index + " element:";
       String n = "";

         for (String g : elements){
            n = n +"\n"
            + g;
        }
    
        if(index == 1 ){
            return output + n;
        } else{
            return outputs + n;
        }

       

      
    
}
}