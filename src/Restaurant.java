public class Restaurant extends User {
    private Menu menu;
    pr double income;
    public Restaurant(String name, String email, Address address, String password) {
        super(name, email, address, password);
        this.income=0.0;
    }
    
}