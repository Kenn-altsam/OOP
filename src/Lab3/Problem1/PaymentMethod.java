package Lab3.Problem1;

public interface PaymentMethod {
    void processPayment(double amount);
    void refund(double amount);
    String getPaymentDetails();
}
