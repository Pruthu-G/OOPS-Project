public class Restaurant extends User {
    private Menu menu;
    private double income;
    public Restaurant(String name, String email, Address address, String password) {
        super(name, email, address, password);
        this.income=0.0;
    }
    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
}