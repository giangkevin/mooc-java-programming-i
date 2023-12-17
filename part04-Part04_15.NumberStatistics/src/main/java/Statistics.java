
public class Statistics {
    private int count;
    private int sum;

    public Statistics(){

    }

    public void addNumber(int number){
        count++;
        this.sum += number;
    }

    public int getCount(){
        return this.count;
    }

    public int sum(){
        return this.sum;
    }

    public double average(){
        if (count != 0 && sum != 0){
            return 1.0 * this.sum / this.count;
        }
        return 0.0;
    }

}
