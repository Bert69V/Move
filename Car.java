public class Car extends Vehicle {  

    public Car (String brand, int kilometers) {  
        super(brand, kilometers);  
    }
    public String doStuff() {
           return ("I am  " + this.brand() + " and I go zoom zoom zoom!");
    }
}