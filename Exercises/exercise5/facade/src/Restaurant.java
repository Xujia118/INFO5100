// In the kitchen
class Chef {
    public void prepareDish(String dish) {
        System.out.println("The chef is preparing " + dish);
    }
}

class Waiter {
    public void takeOrder(String dish) {
        System.out.println("The waiter is taking order " + dish);
    }

    public void serveDish(String dish) {
        System.out.println("The waiter is serving " + dish);
    }
}

class Cashier {
    public void handlesPayment(Double amount) {
        System.out.println("The cashier is depositing $" + amount);
    }
}

// Facade
class Restaurant {
    private Chef chef;
    private Waiter waiter;
    private Cashier cashier;

    public Restaurant() {
        chef = new Chef();
        waiter = new Waiter();
        cashier = new Cashier();
    }

    public void orderMeal(String dish) {
        waiter.takeOrder(dish);
        chef.prepareDish(dish);
        waiter.serveDish(dish);
        cashier.handlesPayment(calculatePrice(dish));
    }

    private double calculatePrice(String dish) {
        if (dish.toLowerCase().equals("burger")) {
            return 10.0;
        } else if (dish.toLowerCase().equals("pasta")) {
            return 15.0;
        } else {
            return 0.0;
        }
    }
}

