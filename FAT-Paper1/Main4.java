// package FAT-Paper1;

abstract class Book{
    String bookTitle;
    String author;
    String isbn;
    double price;

    abstract void displayDetails();

    public Book(String bT, String aut, String isbn, double price){
        bookTitle = bT;
        author = aut;
        this.isbn = isbn;
        this.price = price;
    }
}

class Ebook extends Book{
    public Ebook(String bT, String aut, String isbn, double price){
        super(bT, aut, isbn, price);
    }
    @Override
    public void displayDetails(){
        System.out.println("Book Title: "+bookTitle+"\nBook type: E-book\nAuthor: "+author+"\nISBN: "+isbn);
        if(price<500){
            System.out.println("Price: "+price);
        }else{
            System.out.println("Price: Book price is invalid");
        }
    }
}

class PrintedBook extends Book{
    public PrintedBook(String bT, String aut, String isbn, double price){
        super(bT, aut, isbn, price);
    }
    @Override
    public void displayDetails(){
        System.out.println("Book Title: "+bookTitle+"\nBook type: Hardcover\nAuthor: "+author+"\nISBN: "+isbn);
        if(price>=500){
            System.out.println("Price: "+price);
        }else{
            System.out.println("Price: Book price is invalid");
        }
    }
}

public class Main4 {
    public static void main(String[] args) {
        Ebook e1 = new Ebook("Introduction to JAVA", "Sunita Arora", "978-3-16-148410-0", 150.75);
        e1.displayDetails();

        System.out.println();

        PrintedBook p1 = new PrintedBook("Introduction to JAVA", "Sunita Arora", "978-3-16-148410-0", 10);
        p1.displayDetails();
    }
}
