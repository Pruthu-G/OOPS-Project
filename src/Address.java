public class Address {
      private String address;
      private double x;
      private double y;
      private double scope;
      Address(String address, double x, double y , double scope) {
          this.address = address;
          this.x = x;
          this.y = y;
          this.scope = scope;
      }
      public String getAddress() {
          return address;
      }
      public void setAddress(String address) {
          this.address = address;
      }
      public double getX() {
          return x;
      }
      public void setX(double x) {
          this.x = x;
      }
      public double getY() {
          return y;
      }
      public void setY(double y) {
          this.y = y;
      }
      public double getScope() {
          return scope;
      }
      public void setScope(double scope) {
          this.scope = scope;
      }
      public double distance(Address other) {
          return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
      }
      public boolean isWithinScope(Address other) {
          return this.distance(other) <= this.scope+other.scope;
      }
}