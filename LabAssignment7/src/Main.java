public class Main {

    public static void main(String[] args){
        Student student = new Student();

        Resource Book = new Book("JAVA For Beginner");
        Resource Capstone = new Capstone("Automatic Drive System");
        Resource Internet = new Internet("Google.com");
        Resource Journal = new Journal("Hudyat");
        Resource Newspaper = new Newspaper("Pang-Masa");
        Resource Thesis = new Thesis("Fake News Detection Using Narrative Content and Discourse,");

        student.studentBorrowResource(Book);
        student.studentBorrowResource(Capstone);
        student.studentBorrowResource(Internet);
        student.studentBorrowResource(Journal);
        student.studentBorrowResource(Newspaper);
        student.studentBorrowResource(Thesis);




    }

}
