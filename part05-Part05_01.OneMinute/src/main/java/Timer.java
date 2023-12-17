public class Timer{
    private ClockHand seconds;
    private ClockHand secondsOfHundred;

    public Timer(){
        this.seconds = new ClockHand(60);
        this.secondsOfHundred = new ClockHand(100);
    }

    public void advance(){
        this.secondsOfHundred.advance();

        if (this.secondsOfHundred.value() == 0 ){
            this.seconds.advance();
        }
    }

    public String toString(){
        return seconds +":" + secondsOfHundred;
    }
}