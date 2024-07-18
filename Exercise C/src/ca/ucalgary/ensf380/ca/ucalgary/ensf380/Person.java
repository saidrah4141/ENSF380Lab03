package ca.ucalgary.ensf380;

public class Person {

    protected String name;
    protected String phoneNumber;
    protected String emailAddress;
    protected Address address;
    private static int lastPersonalNumber;

    
    public Person(String name, String phoneNumber, String emailAddress, Address address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
        }
    
    protected static String nextPersonalNumber(short type) {
        
        return "PN" + (++lastPersonalNumber) + type;
        }
    
    public boolean hasValidAddress() {
            return address.validate();
        }
    
    public String getName() {
            return name;
        }
    
    public void setName(String name) {
            this.name = name;
        }
    
    public String getPhoneNumber() {
            return phoneNumber;
        }
    
    public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    
    public String getEmailAddress() {
            return emailAddress;
        }
    
    public void setEmailAddress(String emailAddress) {
            this.emailAddress = emailAddress;
        }

    public Address getAddress() {
            return address;
        }

    public void setAddress(Address address) {
            this.address = address;
        }
}