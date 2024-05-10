public class Capstone implements Resource{
    private String nameOfCapstone;

    public Capstone(String nameOfCapstone) {
        this.nameOfCapstone = nameOfCapstone;
    }

    @Override
    public void borrowResource() {
        System.out.println("This Capstone is  " + nameOfCapstone + " and it has been borrow a student ");

    }
}
