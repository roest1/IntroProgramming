package carsproject;

/**
 * Submit time: 6:02 pm
 * @professor Dr. Mahmoud
 * @author rileyoest
 */
public class Car implements Comparable <Car>{

    private long carVIN;
    private String model;
    private int year;
    private double mileage;

    public Car() {

    }

    public Car(long carVIN, int year, String model) {
        this.carVIN = carVIN;
        this.year = year;
        this.model = model;

    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getInfo() {
        return String.format("%d %s (VIN: %d, Mileage: %,.1f mile)", year, model, carVIN, mileage);

    }
   
    public int compareTo(Car other){
        return Integer.compare(year, other.year);
        
    }

}
