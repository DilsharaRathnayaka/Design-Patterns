// Strategy interface 
// Defines the `PaymentStrategy` interface with a `pay` method. 
 
interface PaymentStrategy { 
    void pay(double amount); 
} 
// Concrete Strategy for Credit Card payment - Implement the payment algorithms for different payment methods. 
// Implements the `PaymentStrategy` interface for credit card payments. 
class CreditCardPayment implements PaymentStrategy { 
    private String cardNumber; 
 
   // Constructor that sets the card number. 
    public CreditCardPayment(String cardNumber) { 
        this.cardNumber = cardNumber; 
    } 
 
    @Override 
    //// Implements the payment method for credit card payments, printing the amount and the last four digits of the card. 
    public void pay(double amount) { 
        System.out.println(amount + " paid with credit card ending in " + 
cardNumber.substring(cardNumber.length() - 4)); 
    } 
} 
 
// Concrete Strategy for PayPal payment 
// Implements the `PaymentStrategy` interface for PayPal payments. 
class PayPalPayment implements PaymentStrategy { 
    private String email; 
    
    // Constructor that sets the email 
    public PayPalPayment(String email) { 
        this.email = email; 
    } 
 
     
 
@Override 
   // Implements the payment method for PayPal payments, printing the amount and the email. 
    public void pay(double amount) { 
        System.out.println(amount + " paid using PayPal account " + email); 
    } 
} 
 
// Context 
// Defines the `ShoppingCart` class that uses a payment strategy. 
class ShoppingCart { 
   // Stores the current payment strategy. 
    private PaymentStrategy paymentStrategy; 
 
    // Method to set the strategy 
   // Sets the payment strategy. 
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) { 
        this.paymentStrategy = paymentStrategy; 
    } 
 
    // Processes the payment using the current strategy. 
    public void checkout(double amount) { 
        if (paymentStrategy == null) { 
            // Throws an exception if the payment strategy is not set 
            throw new IllegalStateException("Payment strategy not set"); 
        } 
        // Calls the `pay` method of the current payment strategy. 
        paymentStrategy.pay(amount); 
    } 
} 
 
