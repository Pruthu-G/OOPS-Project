public class Restaurant extends User {
    private Menu menu;
    private double income;
    Restaurant(String name, String email, Address address, String password) {
        super(name, email, address, password);
    }
    public Menu getMenu() {
        return menu;
    }
    public void setMenu(Menu menu) {
        this.menu = menu;
    }   
    public double getIncome() {
        return income;
    }
    public void setIncome(double income) {
        this.income = income;
    }
}