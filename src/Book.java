public class Book{
    private String bookName;
   private int publishYear;
   private Author author;

    public Book (String bookName, int publishYear, Author author) {
        this.bookName = bookName;
        this.publishYear = publishYear;
        this.author = author;
    }
    public String getBookName () {
        return this.bookName;
    }
    public int getPublishYear () {
        return this.publishYear;
    }
    public void setPublishYear (int publishYear) {
        this.publishYear = publishYear;
    }
    public Author getAuthor() { return author; }

    public String toString() {
        return "название книги " + bookName + " год публикации " + publishYear + " " + author;
    }
}
