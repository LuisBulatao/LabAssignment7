public class Journal implements Resource{
    private String nameOfJournal;

    public Journal(String nameOfJournal) {
        this.nameOfJournal = nameOfJournal;
    }

    @Override
    public void borrowResource() {
        System.out.println("This Journal  of " + nameOfJournal + " has been borrow a student ");

    }
}