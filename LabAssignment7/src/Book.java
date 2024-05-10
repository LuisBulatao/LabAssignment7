public class Book implements Resource {
    private String nameOfBook;

    public Book(String nameOfBook){
        this.nameOfBook = nameOfBook;
    }
    @Override
    public void borrowResource() {
        System.out.println("This book of " + nameOfBook + " has been borrow a student ");
    }
}
