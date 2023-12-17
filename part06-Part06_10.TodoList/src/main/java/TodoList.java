import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;

    public TodoList(){
        this.list = new ArrayList<>();
    }

    public void add(String task){
        this.list.add(task);
    }

    public void print(){
        int index = 1;
        for(String tasks : this.list){
            System.out.println(index + ": " + tasks);
            index++;
        }
    }

    public void remove(int number){
        this.list.remove(number-1);
    }
}
