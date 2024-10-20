// Component interface 
// Defines the `Coffee` interface with methods for description and cost. 
interface Coffee { 
    String getDescription(); 
    double getCost(); 
} 
 
// Concrete Component - The primary object that can be decorated. 
class SimpleCoffee implements Coffee { 
    @Override 
    public String getDescription() { 
        return "Simple Coffee"; 
    } 
 
    @Override 
    public double getCost() { 
        return 5.0; 
    } 
} 
 
 
 
// Base Decorator - Implements the component interface and holds a reference to a component object
// Abstract class that implements the `Coffee` interface and serves as the base decorator. 
abstract class CoffeeDecorator implements Coffee { 
    // Holds a reference to a `Coffee` object being decorated. 
    protected Coffee decoratedCoffee; 
 
    public CoffeeDecorator(Coffee coffee) { 
        this.decoratedCoffee = coffee; 
    } 
 
    public String getDescription() { 
        return decoratedCoffee.getDescription(); 
    } 
 
    public double getCost() { 
        return decoratedCoffee.getCost(); 
    } 
} 
 
// Concrete Decorators - Extend the base decorator and add functionality. 
// Concrete decorator that adds milk to the coffee 
class MilkDecorator extends CoffeeDecorator { 
    // Constructor that sets the decorated coffee. 
    // Constructor that calls the superclass constructor with the coffee to be decorated. 
    public MilkDecorator(Coffee coffee) { 
        super(coffee); 
    } 
 
    public String getDescription() { 
        return super.getDescription() + ", Milk"; 
    } 
 
    public double getCost() { 
        return super.getCost() + 1.5; 
    } 
} 
// Concrete decorator that adds sugar to the coffee. 
class SugarDecorator extends CoffeeDecorator { 
    // Constructor that calls the superclass constructor with the coffee to be decorated. 
    public SugarDecorator(Coffee coffee) { 
        super(coffee); 
    } 
 
    public String getDescription() { 
        return super.getDescription() + ", Sugar"; 
    } 
 
    public double getCost() { 
        return super.getCost() + 0.5; 
    } 
} 
 
