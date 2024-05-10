public class Thesis implements Resource{
    private String nameOfThesis;

    public Thesis(String nameOfThesis) {
        this.nameOfThesis = nameOfThesis;
    }

    @Override
    public void borrowResource() {
        System.out.println("This Thesis " + nameOfThesis + " has been borrow a student ");

    }
}