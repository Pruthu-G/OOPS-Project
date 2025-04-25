public class Restaurant extends User {
    private Menu menu;
    private double income;
    Restaurant(String name, String email, Address address, String password) {
        super(name, email, address, password);
    }
}