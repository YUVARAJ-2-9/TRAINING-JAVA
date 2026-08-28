package Abstraction;
abstract class FoodApp{
    abstract void PlaceOrder(String foodItem);
}
class Swiggy extends FoodApp{
    @Override
    void PlaceOrder(String foodItem) {
        System.out.println("Restaurant accepted your order for" +" " + foodItem);
        System.out.println("Delivery partner assigned... ");
        System.out.println("Food is on the Way");
    }
}

public class Zomato {
    public static void main(String[] args) {
        FoodApp ob = new Swiggy();
        ob.PlaceOrder("Tandoori!");
    }
}
