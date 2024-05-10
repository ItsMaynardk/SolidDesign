public class Library {
    private Resource[] resources;

    public Library() {
        this.resources = new Resource[] {
                new Book("Java Programming"),
                new Journal("Nature")
        };
    }
    
    public void displayAvailableResources() {
        System.out.println("Available Resources at NEU Library:");
        for (Resource resource : resources) {
            String resourceName = resource.getClass().getSimpleName();
            String resourceTitle = (resource instanceof Book) ? ((Book) resource).getTitle() : ((Journal) resource).getTitle();
            System.out.println("- " + resourceName + ": " + resourceTitle);
        }
    }
}
