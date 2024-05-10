public interface Resource {
    void borrow(Student student);
    void returnResource(Student student);
}