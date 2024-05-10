public class Newspaper implements Resource {
    private String nameOfnewsPaper;

    public Newspaper(String nameOfnewsPaper) {
        this.nameOfnewsPaper = nameOfnewsPaper;
    }

    @Override
    public void borrowResource() {
        System.out.println("This Newspaper of " + nameOfnewsPaper + " has been borrow a student ");
    }
}