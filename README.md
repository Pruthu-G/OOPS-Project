# OOPS-Project
Project built in java for OOPs course

# classes 
> abstract class User 

> costumer extends user

> restaurant extends user 

> deliverypartner extends user 

> class Orders -> Restaurant, Costumer and DP, payment options 

# interface 
> UserInterface - > login() , repr() , logger()

# basic outline 

> User - email name password address  
```
    methods :

    getter and setter for email, name and address

    setter only for password
```

> Costumer extends User - restaurantScope itemPreference rewardPoints payments

```
    methods :

    placeOrder(item , payments ) -> Order

    giveDiscount -> discount a payment if rewards available
```

> Restaurant extends User - Item[] menu paymentOptions orderQueue
```
    takeOrder(order) -> push to orderQueue

    sendOrder() -> push least latest order to a deliveryPartner
```

> DeliveryPartner extends User - restaurantScope costumerScope
```
    deliverOrder(order) -> return time of delivery
```

> Item - name cuisine isAvailable 
```
    getter and setter
```

> Payment - type amount 
```
    
```


