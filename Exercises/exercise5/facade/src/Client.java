// Client
public class Client {
    // He doesn't need to see what's in the kitchen.
    // He just needs to interact with the restaurant facade.
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.orderMeal("burger");
        restaurant.orderMeal("pasta");
    }
}