import java.util.List;

public class Menu {
    //an item should be encapsulated by the menu as it is uniquie to a restaurant and it's menu 
    //implements nested classes ,wrapper classes ,toStirig method
   
   public static class Item {
        private String name;
        private String cuisine;
        private double price;

        Item(String name, String cuisine, double price) {
            this.name = name;
            this.cuisine = cuisine;
            this.price = price;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getCuisine() {
            return cuisine;
        }
        public void setCuisine(String cuisine) {
            this.cuisine = cuisine;
        }
        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }

   }
   private List<Item> items;
   Menu(List<Item> items) {
       this.items = items;
   }
    public List<Item> getItems() {
         return items;
    }
    public void setItems(List<Item> items) {
         this.items = items;
    }
    public void addItem(Item item) {
         items.add(item);
    }
    public void removeItem(Item item) {
         items.remove(item);
    }

}
