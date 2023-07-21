package abstraction;

public class TextBook extends Novel {

    private String subject;


    public TextBook(String title, String author, double price, String genre, String subject) {
        super(title, author, price, genre);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void displayInfo() {
        System.out.println("Title= "+ getTitle() + "Author= "+ getAuthor()+ "Price= "+ getPrice()+ " Genre="+ getGenre()+ "Subject= "+ getSubject());

    }

    @Override
    public String toString() {
        return " TextBook{" +
                " subject='" + subject + '\'' +
                " genre='" + getGenre() + '\'' +
                " title='" + getTitle() + '\'' +
                ", author='" + getAuthor() + '\'' +
                ", price='" + getPrice() + '\''+

                '}';
    }
}
