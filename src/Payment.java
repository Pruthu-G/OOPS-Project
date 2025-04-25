public class Payment
{
    Customer customer;
    Restaurant restaurant;
    Order order;
    int type;

    public Payment(Customer customer, Restaurant restaurant, Order order) {
        this.customer=customer;
        this.order=order;
        this.restaurant=restaurant;

    }

public boolean  payments() throws InsufficientBalanceException
{
    switch (type)
    {
     case 1 : System.out.println("Payment - COD");
              return order.addIncome(); 
             

     case 2:  if(customer.balace>=order.getorderCost())
               {
               customer.balace=customer.balace-order.getorderCost();
               System.out.println("Payment Successful");
               return order.addIncome();
               }
               else
               {
                throw new InsufficientBalanceException("Insufficient Balnce");
               }
     case 3:   System.out.println("Payment Successful through UPI");
            return order.addIncome();
     

     default: System.out.println("Enter valid input");
     return false;
    }
}


     

     
    }
}

    

    
}