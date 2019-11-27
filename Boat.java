public class Boat extends Vehicle {  

    public Boat (String brand, int kilometers) {  
        super(brand, kilometers);  
    }
    public String doStuff() {
        return ("I am  " + this.brand() + " and I go glug glug glug!");
    }    
}