import java.util.ArrayList;

public class Library {
    private ArrayList<Book>  totalBook;
    String addres;

    public Library(String addres) {
        totalBook = new ArrayList<>();
        this.addres = addres;
    }
    public void addBook(Book book) {
        totalBook.add(book);
    }
    public void printAvailableBooks(){
        for (Book book : totalBook) {
            System.out.println("Ten sach: " + book.getTitle() );
        }
    }
    public void printAddress() {
        System.out.println(addres);
    }
    public void brrowBook(String name){

        totalBook.remove(book);

    }
    public void returnBook(){

    }

    public static void main(String[] args) {
//        Taoj 2 thu vien co dia chi
        Library firstLibrary = new Library("10MaiSt.");
        Library secondLibrary = new Library("228LibertyST.");
//        add them 4 cuon sach
        firstLibrary.addBook(new Book("Family and Friend"));
        firstLibrary.addBook(new Book("Math"));
        firstLibrary.addBook(new Book("Formal Method"));
        firstLibrary.addBook(new Book("Logic"));

//        in dia chi thu vien
        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();
//        Muon sach Familyand Fried
        System.out.println("Brrowing the Family and Friend");
        firstLibrary.brrowBook(new Book("Family and Friend"));
        firstLibrary.brrowBook(new Book("Family and Friend"));
        secondLibrary.brrowBook(new Book("Family and Friend"));
        System.out.println();
//        in danh sách hiện có
        System.out.println("Danh muc sach hien co trong thu vien thu nhat: ");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Danh sach trong thu vien thu hai: ");
        secondLibrary.printAvailableBooks();
        System.out.println();

    }
}
