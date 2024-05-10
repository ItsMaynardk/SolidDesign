public class TestProgram {
    public static void main(String[] args) {
        Library neuLibrary = new Library();
        neuLibrary.displayAvailableResources();

        Resource book = new Book("Java Programming");
        Resource journal = new Journal("Nature");
        Student juan = new Student("Juan");
        Student pedro = new Student("Pedro");

        book.borrow(juan);
        journal.borrow(pedro);

        book.returnResource(juan);
        journal.returnResource(pedro);
    }
}
