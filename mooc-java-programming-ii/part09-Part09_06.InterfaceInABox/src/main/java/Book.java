public class Book implements Packable {

    private String author;
    private String bookName;
    private double bookWeight;

    public Book(String author, String name, double weight) {
        this.author = author;
        this.bookName = name;
        this.bookWeight = weight;
    }

    @Override
    public double weight() {
        return this.bookWeight;
    }

    @Override
    public String toString() {
        return this.author + ": " + this.bookName;
    }
}
