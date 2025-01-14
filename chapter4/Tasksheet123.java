package chapter4;

    class Book {
        String title;
        String author;
        int yearPublished;
        double price;

        public Book(String title, String author,int yearPublished, double price) {
            this.title = title;
            this.author = author;
            this.yearPublished = yearPublished;
            this.price = price;
    }
    
    @Override
    public String toString() {
        return "Title: " + title + "\n" +
        "Author: " + author + "\n" +
        "Year Published: " + yearPublished + "\n" + 
        "Price: $" + price + "\n";
    }
}

    
public class Tasksheet123 {
        public static void main(String[] args) {

        Book[] books = new Book[3];
            books[0] = new Book("Java Programming", "John Smith", 2021, 39.99);
            books[1] = new Book("Python Basics", "Jane Doe", 2020, 29.99);
            books[2] = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);
    

        for (int i=0; i<books.length; i++) { 
            System.out.println("Book " + (i+1) + ":");
            System.out.println(books[i].toString());
        }
    }
}
