import java.util.HashMap;


public class Address {
private String address;

public String getAddress() {
    return address;
}

public void setAddress(String address) {
    this.address = address;
}
   private double x,y;
   Address(String address, double x, double y) {
      this.address = address;
      this.x = x;
      this.y = y;
   }
   public double findDistance(Address other) {
      return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
   }
}