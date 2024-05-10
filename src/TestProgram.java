public class TestProgram {
    public static void main(String[] args) {
        Resource book = new Book("Java Programming");
        Resource journal = new Journal("Nature");
        Student juan = new Student("Juan", 1001);
        Student pedro = new Student("Pedro", 1002);

        System.out.println("=== Borrowing Resources ===");
        book.borrow(juan);
        journal.borrow(pedro);

        System.out.println("\n=== Returning Resources ===");
        book.returnResource(juan);
        journal.returnResource(pedro);
    }
}