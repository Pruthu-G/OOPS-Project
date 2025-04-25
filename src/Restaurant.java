public class Restaurant extends User {
    private Menu menu;
    Restaurant(String name, String email, Address address, String password) {
        super(name, email, address, password);
    }
}