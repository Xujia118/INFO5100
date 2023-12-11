public class MobilePayment implements PaymentStrategy {
    private String mobileWalletId;

    public MobilePayment(String mobileWalletId) {
        this.mobileWalletId = mobileWalletId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " with mobile payment with ID " + mobileWalletId);
    }
}
