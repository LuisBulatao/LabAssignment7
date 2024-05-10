public class Internet implements Resource {
    private String theInternetAcees;

    public Internet(String theInternetAcees) {
        this.theInternetAcees = theInternetAcees;
    }

    @Override
    public void borrowResource() {
        System.out.println(theInternetAcees + " accessed by a student.");
    }
}