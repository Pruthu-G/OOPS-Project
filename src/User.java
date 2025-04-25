public class User{
    private String name;
    private String email;
    private Address address;
    protected String password;
    private int number;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    User(String name, String email, Address address, String password) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.password = password;
        this.number=number;
    }
    //Overloaded user constructor for delivery guy as he won't need address and email
    User(String name,String password,int number){
        this.name=name;
        this.password=password;
        this.number=number;
    }

   
}
