import java.util.List;

public class Order {
   private Customer customer;
   private  DeliveryPartner deliveryGuy;
    private List<Menu.Item> items;
    private Restaurant restaurant;
    private int bill;
    private String orderStatus;


    Order(List<Menu.Item> item, Restaurant restaurant,Customer customer,String orderStatus){
         this.customer=customer;
         this.items=item;
         this.customer=customer;
         this.orderStatus=orderStatus;
         
    }
    public void updateOrderStatus(String status){
        this.orderStatus=status;
    }

    void assignDeliveryGuy(DeliveryPartner deliveryguy){
        this.deliveryGuy=deliveryguy;
    }

    double orderCost(){
        double s=0;
        for(Menu.Item i: this.items)
        {
            s+=i.getPrice();
        }
        if(customer.getPoints()>0)
        {
            s-=customer.getPoints()*0.1;
            customer.setPoints(0);
        }
        return s;
    }
    }

    public boolean  addIncome()
    {
        restaurant.income=restaurant.income + this.orderCost();
        return true;

    }


    public void addItem(Menu.Item... items){
        if(items!=null)
        for(Menu.Item i: items){
            this.items.add(i);
        }

    }
    public void removeItem(Menu.Item... items)
    {
        if(items!=null)
        for(Menu.Item i: items){
            this.items.remove(i);
        }
    }


    
   

}
