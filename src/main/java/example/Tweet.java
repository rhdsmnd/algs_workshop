package example;

public class Tweet {

    public Tweet(String author, String text) {
        this.setAuthor(author);
        this.setText(text);
    }

    private String author;
    private String text;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}