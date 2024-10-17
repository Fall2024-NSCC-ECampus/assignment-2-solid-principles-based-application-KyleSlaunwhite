public class Company {
    private String companyName;
    private String address;
    private String contactInfo;

    public Company(String companyName, String address, String contactInfo) {
        this.companyName = companyName;
        this.address = address;
        this.contactInfo = contactInfo;
    }

    public void getCompanyDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Address: " + address);
        System.out.println("Contact Info: " + contactInfo);
    }
}
