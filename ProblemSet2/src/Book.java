public class Book {

   private String title;
   private double price;
   private String isbn;
   private int pages;

   //mutator methods

    public void setTitle(String title){
        this.title = title;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    //accessor methods

    public String getTitle(){
        return title;
    }

    public double getPrice(){
        return price;
    }

    public String getIsbn(){
        return isbn;
    }

    public int getPages(){
        return pages;
    }

    public Book(){
        this("No Title", 0.00, "No ISBN", 0);

    }

    public Book(String title, double price, String isbn, int pages){
        setTitle(title);
        setPrice(price);
        setIsbn(isbn);
        setPages(pages);
    }

    public String toString(){
        return "Title: " + getTitle() + "\nPrice: " + getPrice() + "\nISBN: " + getIsbn() +
                "\nNumber of pages: " + getPages();
    }



}
