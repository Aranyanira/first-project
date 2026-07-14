package practice_3;

public class LibraryTest {
    public static void main(String[] args) {
        Library book1 = new Library();
        book1.author = "Пушкин";
        book1.year = 1890;
        book1.category = "Роман";
        //book1.bookTitle;

        book1.setBookTitle("Евгений Онегин");
        book1.setAuthor("Пушкин А.С.");
        book1.getCategory();
    }
}
