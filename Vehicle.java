public class Vehicle {
    // Attributes
    private String brand;
    private int kilometers;

    //Constructor
    public Vehicle (String brand, int kilometers){
        this.brand = brand;
        this.kilometers = kilometers;
    }    
    //Getter
    public String brand(){
        return this.brand;
    }
    public int kilometers(){
        return this.kilometers;     
    }
    //Setter
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setKilometers (int kilometers) {
        this.kilometers = kilometers;
    }
    //Method
    public String doStuff() {
       return this.brand();
    }
}
