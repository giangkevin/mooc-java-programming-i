import java.util.ArrayList;

public class BirdManager {
    private ArrayList<Bird> birds;

    public BirdManager(){
        this.birds = new ArrayList<>();
    }

    public void addBird(Bird bird){
        this.birds.add(bird);
    }

    public void addObservations(String observation){
        boolean b = false;
        for (int i = 0; i < this.birds.size(); i++){
            if (observation.equals(this.birds.get(i).getName())) {
                this.birds.get(i).addObservations();
                b = true;
            }
        }

        if(b==false){
            System.out.println("Not a bird!");
        }
    }

    public void printAllBirds(){
        for(Bird birds : this.birds){
            System.out.println(birds);
        }
    }

    public void printOneBird(String bird){
        for(Bird birds : this.birds){
            if (bird.equals(birds.getName())) {
                System.out.println(birds);
            }
        }
    }
}
