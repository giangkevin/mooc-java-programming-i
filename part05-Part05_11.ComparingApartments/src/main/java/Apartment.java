
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        if(this.squares > compared.squares){
            return true;
        }
        return false;

    }

    public int priceDifference(Apartment compared){
        if( (this.princePerSquare * this.squares) > (compared.princePerSquare * compared.squares)) {
            return (this.princePerSquare * this.squares) - (compared.princePerSquare * compared.squares);
        }
        return (compared.princePerSquare * compared.squares) - (this.princePerSquare * this.squares);
    }

    public boolean moreExpensiveThan(Apartment compared){
        if (this.princePerSquare > compared.princePerSquare ){
            return true;
        }
        return false;
    }

}
