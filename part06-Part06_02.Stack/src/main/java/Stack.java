import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;

    public Stack(){
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty(){
        if (this.stack.isEmpty()){
            return true;
        }
        return false;
    }

    public void add(String value){
        this.stack.add(value);
    }

    public ArrayList<String> values(){
        return this.stack;
    }

    public String take(){
        String last = this.stack.get(this.stack.size()-1);
        this.stack.remove(this.stack.size()-1);
        return last;
        //return this.values.remove(this.values.size() - 1);
        
    }
}
