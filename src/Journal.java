public class Journal implements Resource{
    private String title;

    public Journal(String title) {
        this.title = title;
    }

    @Override
    public void borrow(Student student) {
        System.out.println(student.getName() + " borrowed '" + title + "' journal from the NEU Library.");
    }

    @Override
    public void returnResource(Student student) {
        System.out.println(student.getName() + " returned '" + title + "' journal to the NEU Library.");
    }
}