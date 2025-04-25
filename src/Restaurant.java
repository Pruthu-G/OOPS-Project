import java.io.Console;
import java.util.Arrays;

public class Restaurant extends User implements UserInterface {
    private int restaurantId;
    private String[] cuisineType;
    private Menu menu;


    // Constructor for Restaurant
    public Restaurant(int restaurantId,String name, String email, Address address, String password,Menu menu) {
        super(name,email,address,password);
        this.menu=menu; // Call the constructor of the User class
        
    }
     public boolean login() throws UserException {
        Console console = System.console();
        if (console == null) {
            throw new UserException("No console available for input.");
        }
        System.out.println("-------------------- Welcome to Restaurant Login --------------------");
        System.out.println("Enter your email: ");
        String email = console.readLine();
        if(email.equals(email)){
            System.out.println("Enter your password: ");
            String password = new String(console.readPassword());
            if(password.equals(this.password)) {
                System.out.println("Login successful!");
            } else {
                throw new UserException("Invalid password. Please try again.");
            }
        }
        return true;//bhai code likh dena
    }
    public boolean signin() throws UserException{
        //this is essentially just a constructor
        return true; //bhai code likhde 
    }
    
    public String toString(){
        String a = concatenateStrings(this.menu.cuisine);
        String s= " RestaurantID :" +this.restaurantId +"Name :" +super.getName()+a;
        return s;
    }
    public static String concatenateStrings(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            if (str != null) {  // Optional: skip null elements
                result.append(str);
            }
        }
        return result.toString();
    }

   public static void main(String[] args) throws UserException {
        // Example usage of the Restaurant class
        Address address = new Address("123 Main St", 70.0, 40.0);
        String[] cuisine = {"Italian", "Chinese", "Indian"};
        Menu menu = new Menu(cuisine);
        Menu.Item item1 = menu.new Item(12.99, "Pasta", "Italian", 4.5, true);
        Menu.Item item2 = menu.new Item(8.99, "Fried Rice", "Chinese", 4.0, true);
        Menu.Item item3 = menu.new Item(10.99, "Curry", "Indian", 4.8, true);
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        Restaurant restaurant = new Restaurant(1, "Restaurant Name", "mail@mail.com", address, "password123", menu);
        while (true) {
            try {
            restaurant.login();
            break; // Exit the loop if login is successful
            } catch (UserException e) {
            System.out.println(e.getMessage());
            }
        }
   } 


}