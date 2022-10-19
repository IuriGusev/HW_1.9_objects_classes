public class Book{
    private String bookName;
   private int publishYear;
    public Book (String bookName, int publishYear) {
        this.bookName = bookName;
        this.publishYear = publishYear;
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

}
