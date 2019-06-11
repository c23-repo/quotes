package quotes;



public class Quotes {

    private String author;
    private String text;
    private String quote;
    private String character;


    public Quotes(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public String toString(){
        return String.format("Quote: %s \n- %s", this.text, this.author);
    }

    public String toString_API(){
        return String.format("Quote: %s \n- %s", this.quote, this.character);
    }

    public String getAuthor() {
        return author;
    }


    public String getQuote() {
        return quote;
    }

    public String getCharacter() {
        return character;
    }
}
