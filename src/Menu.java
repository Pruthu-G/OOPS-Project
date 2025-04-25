
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Menu {
    //an item should be encapsulated by the menu as it is uniquie to a restaurant and it's menu 
    //implements nested classes ,wrapper classes ,toStirig method
    public class Item{
        String name;
        double price;
        String cuisine;
        double rating;
        Boolean status;
        public Item(double price,String name,String cuisine,double rating,boolean status) {
            this.price=price;
            this.name=name;
            this.cuisine=cuisine;
            this.status=status;
        }
        //a method to display the item
        void displayItem(){
            System.out.println("Item :" +this.name+"\nPrice : " + this.price+ " \n Cuisine :"+ this.cuisine  + "\nRating : "+this.rating +"\nStatus : "+this.status.toString());
        }
        
    }
    public List<Item> items;
    public String[] cuisine;
   
    public Menu(String[] cuisine) 
    {
        this.cuisine=cuisine;
        this.items=new ArrayList<>();
    }
    public void addItem(Item item){
        this.items.add(item);
    }
    public void removeItem(Item item){
        this.items.remove(item);
    }
    public void displayMenu(){
        for(Item i:this.items)
        {
            i.displayItem();
        }

    }
    //function filters by cuisine
    public void filterCuisineDisplay(String cuisine){
        for(Item i:this.items){
            if(i.cuisine.equals(cuisine))
            {
                i.displayItem();
            }
        }
    }
    //filters items under or equal to a certain price, doesn't sort 
    public void filterPriceDisplay(int  price){
        for(Item i:this.items){
            if(i.price<=price)
            {
                i.displayItem();
            }
        }
    }
    public void filterRatingDisplay(double rating){
        for(Item i:this.items){
            if(i.rating>=rating)
            {
                i.displayItem();
            }
        }
    }
    //sets item's status
    public void setItemStatus(Item item,boolean status){
        for(Item i:this.items){
            if(i.equals(item))
            i.status=status;
        }
    }

    //AI driven suggestions function please complete 
    /*public Item[] suggestions(){

    }

    */



}
