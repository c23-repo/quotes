package quotes;



public class Quotes {

    private String author;
    private String text;

    public Quotes(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public String toString(){
        return String.format("Quote: %s - %s", this.text, this.author);
    }

    public String getAuthor() {
        return author;
    }
}
