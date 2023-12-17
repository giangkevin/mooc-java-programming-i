import java.util.ArrayList;

public class Room {
    private ArrayList<Person> list;

    public Room(){
        this.list = new ArrayList<>();
    }

    public void add(Person person){
        this.list.add(person);
    }

    public boolean isEmpty(){
        if (this.list.isEmpty()){
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons(){
        return this.list;
    }

    public Person shortest(){
        if (this.list.isEmpty()){
            return null;
        }

        Person returnObject = this.list.get(0);

        for (Person prs : this.list){
            if (returnObject.getHeight() > prs.getHeight()){
                returnObject = prs;
            }
            
        }
        return returnObject;
    }

    public Person take(){
        Person shortestPerson = shortest();
        this.list.remove(shortestPerson);
        return shortestPerson;
    }
}
