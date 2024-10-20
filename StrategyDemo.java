public class StrategyDemo { 
    public static void main(String[] args) { 
        // Creates a new shopping cart. 
        ShoppingCart cart = new ShoppingCart(); 
         
        // Sets the payment strategy to credit card payment. 
        cart.setPaymentStrategy(new CreditCardPayment("1234567812345678")); 
        // Processes the payment using the credit card strategy. 
        cart.checkout(100.0); 
         
        //Sets the payment strategy to PayPal payment. 
        cart.setPaymentStrategy(new PayPalPayment("user@example.com")); 
        cart.checkout(200.0); 
    } 
}