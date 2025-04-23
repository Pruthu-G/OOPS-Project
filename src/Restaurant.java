public class Restaurant extends User implements UserInterface {

    // Constructor for Restaurant
    public Restaurant(String name, String email, Address address, String password) {
        super(name,email,address,password); // Call the constructor of the User class
    }
    public boolean login() throws UserException {
        
    }
}