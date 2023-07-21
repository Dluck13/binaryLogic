package abstraction;

public class Novel extends Book{

    private String genre;


    public Novel(String title, String author, double price, String genre) {
        super(title, author, price);
        this.genre=genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("title= "+ getTitle() + "author= "+ getAuthor()+ "price = "+ getPrice()+ "genre"+ getGenre());

    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return " Novel{" +
                " genre='" + genre + '\'' +
                '}';
    }
}
