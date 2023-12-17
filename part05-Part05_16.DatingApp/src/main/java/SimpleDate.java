
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    
    public void advance(){
        if(this.day == 30){
            this.day = 0;
            if(this.month == 12){
                this.month = 0;
                this.year += 1;
            }
            this.month +=1;
        }
        this.day += 1;
    }
    
    public void advance(int howManyDays){
        int totalDays = this.day + howManyDays;
        if(totalDays > 30){
            this.day = totalDays - 30;
            if(this.month == 12){
                this.month = 0;
                this.year += 1;
            }
            this.month +=1;
        }else{
            this.day += howManyDays;
        }
    }
    
    public SimpleDate afterNumberOfDays(int days){
        SimpleDate sp = new SimpleDate(this.day,this.month,this.year);
        sp.advance(days);
        return sp;
    }
}
