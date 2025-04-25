public class DeliveryPartner extends User{
    private Restaurant[] restaurantScope;
    private Customer[] customerScope;
    DeliveryPartner(String name, String email,Address address, String password,Order order , Restaurant[] restaurantScope, Customer[] customerScope) {
        super(name, email, address, password);
        this.restaurantScope = restaurantScope; 
        this.customerScope = customerScope;
    }
    
}