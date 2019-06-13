package quotes;


import java.util.ArrayList;

public class Quotes {

    private String author;
    public String text;



    public Quotes(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public Quotes(String text) {
        this.text = text;
    }

    public String toString(){
        return String.format("Quote: %s \n- %s", this.text, this.author);
    }

    public String toString_API(){
        return String.format("Quote: %s \n- Ron Swanson", this.text);
    }

}
