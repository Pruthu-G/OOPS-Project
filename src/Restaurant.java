



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
        return true;//bhai code likh dena
    }
    public boolean signin() throws UserException{
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

   


}