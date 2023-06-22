public class Book {
    String title;
    Boolean borrowed;

    public Book(String bookTitle){
        this.title = bookTitle;
        this.borrowed = false;

    }
    public void borrowed() {
        this.borrowed = true;
    }
    public void returned() {
        this.borrowed = false;
    }
    public Boolean isBrrowed() {
        return  borrowed;
    }
    public String getTitle(){
        return title;
    }

    public static void main(String[] args) {
        Book book = new Book("Family and Friend") ;
        System.out.println("Title(should be Family and Friend):" + book.getTitle());

        System.out.println("Borrowed?(should be false):" + book.isBrrowed());
        book.borrowed();

        System.out.println("Brrowed?(should be true):" + book.isBrrowed());
        book.returned();
        System.out.println("Brrowed?(should be false:" + book.isBrrowed());
    }
}



