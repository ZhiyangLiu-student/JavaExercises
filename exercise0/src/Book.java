public class Book {
    String title;
    String author;
    int publicationYear;
    String genre;
    String publisher;
    double price;
    int pageCount;
    String ISBN;
    
    public Book(String title, String author, int publicationYear, String genre, String publisher, double price, int pageCount, String ISBN) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.genre = genre;
        this.publisher = publisher;
        this.price = price;
        this.pageCount = pageCount;
        this.ISBN = ISBN;
    }
    
    public String getBookSummary() {
        return "Title: " + title + "\nAuthor: " + author + "\nGenre: " + genre;
    }
    
    public double calculateDiscountedPrice(double discountPercentage) {
        return price - (price * discountPercentage / 100);
    }
    
    public void printBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("Publisher: " + publisher);
    }
}