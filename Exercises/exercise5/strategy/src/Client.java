public class Client {
    public static void main(String[] args) {
        RestaurantBill restaurantBill = new RestaurantBill();

        // Strategies
        PaymentStrategy cashPayment = new CashPayment();
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432");
        PaymentStrategy mobilePayment = new MobilePayment("mobileWallet123");

        // Set different payment strategies dynamically
        restaurantBill.setPaymentStrategy(cashPayment);
        restaurantBill.processPayment(20.0);

        restaurantBill.setPaymentStrategy(creditCardPayment);
        restaurantBill.processPayment(30.0);

        restaurantBill.setPaymentStrategy(mobilePayment);
        restaurantBill.processPayment(40.0);


    }
}