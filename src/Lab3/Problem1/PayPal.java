package Lab3.Problem1;

class PayPal implements PaymentMethod {
    private String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment: $" + amount);
        System.out.println("Account: " + email);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding $" + amount + " to PayPal account");
    }

    @Override
    public String getPaymentDetails() {
        return "PayPal account: " + email;
    }
}