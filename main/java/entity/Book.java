package entity;

public class Book extends Product{
    private String author;

    private int pages;

    public Book() {
    }

    public Book(String author, int pages) {
        this.author = author;
        this.pages = pages;
    }

    public Book(String name, double price, String author, int pages) {
        super(name, price);
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }


    @Override
    public void display(){
        super.display();
        System.out.println(author);
        System.out.println(pages);

    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", author='" + author + '\'' +
                ", pages=" + pages +
                '}';
    }
}


