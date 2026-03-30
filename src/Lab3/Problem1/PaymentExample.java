package Lab3.Problem1;

public class PaymentExample {

    public static void main(String[] args) {
        PaymentMethod card = new CreditCard("1234-5678-9012-3456", "John Doe");
        PaymentMethod paypal = new PayPal("john@example.com");

        // Both can be used polymorphically
        PaymentMethod[] payments = { card, paypal };

        for (PaymentMethod payment : payments) {
            payment.processPayment(100.00);
            System.out.println("Details: " + payment.getPaymentDetails());
            payment.refund(50.00);
            System.out.println();
        }
    }

}