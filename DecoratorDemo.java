public class DecoratorDemo { 
    public static void main(String[] args) { 
// Creates a simple coffee.         
Coffee coffee = new SimpleCoffee(); 
        System.out.println(coffee.getDescription() + " $" + coffee.getCost()); 
 
        // Decorates the coffee with milk. 
        coffee = new MilkDecorator(coffee); 
        System.out.println(coffee.getDescription() + " $" + coffee.getCost()); 
        
       // Decorates the coffee with sugar. 
        coffee = new SugarDecorator(coffee); 
        System.out.println(coffee.getDescription() + " $" + coffee.getCost()); 
    } 
}