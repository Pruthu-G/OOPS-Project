public class Customer extends User{
    protected double balace;
    Customer(String name, String email, Address address, String password) {
        super(name, email, address, password);
        this.balace=2000.0;
        //TODO Auto-generated constructor stub
    }
    public void setPoints(int points){
        this.points=points;
    }
    
}
