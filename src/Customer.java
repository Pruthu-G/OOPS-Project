public class Customer extends User{
    Customer(String name, String email, Address address, String password) {
        super(name, email, address, password);
        //TODO Auto-generated constructor stub
    }
    public void setPoints(int points){
        this.points=points;
    }
    
}
