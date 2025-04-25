import java.util.List;

public class Order {
   private Customer customer;
   private  DeliveryPartner deliveryGuy;
    private List<Menu.Item> items;
    private Restaurant restaurant;
    private int bill;
    private String orderStatus;


   public Order(List<Menu.Item> item, Restaurant restaurant,Customer customer,String orderStatus){
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

   public double getorderCost(){
        double s=0;
        for(Menu.Item i: this.items)
        {
            s+=i.getPrice();
        }

        if(customer.points>=1000 && customer.getPoints()<2000)
        {
            customer.points=customer.points+(int)(100*Math.random());
            return (0.95*s);
        }
        else if(customer.points>=2000 && customer.getPoints()<3000)
        {
            customer.points=customer.points+(int)(100*Math.random());
            return (0.90*s);
        }
        else if(customer.points>=3000)
        {
            customer.points=customer.points+(int)(100*Math.random());
            return (0.85*s);
        }
        else{
        customer.points=customer.points+(int)(100*Math.random());
        return s;
    }
    }

    public boolean  addIncome()
    {
        restaurant.income=restaurant.income + this.orderCost();
        return true;

    }
    public void addtoOrderHistory()
    {
        customer.orderHistory.add(restaurant.getName());
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
