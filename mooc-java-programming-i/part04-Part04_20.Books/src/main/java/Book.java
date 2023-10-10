public class Book {

    private String title;
    private int page;
    private int year;

    public Book(String title, int page, int year) {
        this.title = title;
        this.page = page;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPage() {
        return this.page;
    }

    public int getYear() {
        return this.year;
    }

    public String toString() {
        return this.title + ", " + this.page + " pages, " + this.year;
    }

}
