public class DeliveryPartner extends User{
    private double speed;
    private int rating;
    DeliveryPartner(String name, String email,Address address, String password,Order order, double speed, int rating) {
        super(name, email, address, password);
        this.speed = speed;
        this.rating = rating;
    }
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
}