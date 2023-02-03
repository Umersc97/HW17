package HW17;

public class Book {
    String title;
    String author;
    String genre;
    int length;
    double price;

    Book(String bTitle, String bAuthor){
        title = bTitle;
        author = bAuthor;
    }

    Book(String bTitle,int bLength,double bPrice){
        title = bTitle;
        length = bLength;
        price = bPrice;
    }
}
