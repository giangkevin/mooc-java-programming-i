public class Book {
    private String name;
    private int pages;
    private int year;

    public Book(String name, int pages, int year){
        this.name = name;
        this.pages = pages;
        this.year = year;
    }
    
    public String getName(){
        return this.name;
    }

    public int getPages(){
        return this.pages;
    }

    public int getYear(){
        return this.year;
    }

    public String toString(){
        return this.name + ", " + this.pages + " pages, " + this.year;
    }

}
