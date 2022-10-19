public class Book{
    private String bookName;
   private int publishYear;

   private String bookAuthor;

    public Book (String bookName, int publishYear, String bookAuthor) {
        this.bookName = bookName;
        this.publishYear = publishYear;
        this.bookAuthor = bookAuthor;
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
    public String getBookAuthor() { return this.bookAuthor; }
}
