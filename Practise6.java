// Constructor Overloading: Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a default constructor and two parameterized constructors:
/*
 * One constructor takes title and author as parameters.
 * The other constructor takes title, author, and price as parameters.
 * Print the values of the variables for each constructor.
 */
class Book{
    private String title;
    private String author;
    private int price;
    
    public Book(){
        
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0;
    }

    public Book(String title,String author){
        this.title = title;
        this.author = author;
        this.price = 0;
    }

    public Book(String title,String author,int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPrice(){
        return price;
    }

}

public class Practise6{
    public static void main(String[] args){
    Book obj1 = new Book();
    System.err.println(obj1.getTitle());
    System.err.println(obj1.getAuthor());
    System.err.println(obj1.getPrice());

    }
}