package Lab3.Problem1;

class CreditCard implements PaymentMethod {
    private String cardNumber;
    private String cardHolder;

    public CreditCard(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment: $" + amount);
        System.out.println("Card: " + cardNumber.substring(cardNumber.length()-4));
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding $" + amount + " to credit card");
    }

    @Override
    public String getPaymentDetails() {
        return "Credit Card ending in " + cardNumber.substring(cardNumber.length()-4);
    }
}