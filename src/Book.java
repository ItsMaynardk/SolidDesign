public class Book implements Resource{
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public void borrow(Student student) {
        System.out.println(student.getName() + " borrowed '" + title + "' book from the NEU Library.");
    }

    @Override
    public void returnResource(Student student) {
        System.out.println(student.getName() + " returned '" + title + "' book to the NEU Library.");
    }
}