//Student Name: Jeremy Webb
//LSU ID: 89-893-8558
//Lab Section: 1
//Assignment: CarsProject
//Submission Time: 1:08pm
package carsproject;

public class Car {
    
    //Initialize Variables
    private long vinNumber;
    public String model;
    public int year;
    public double mileage;
    
    //Default Constructor
    public Car(){
    }
    
    //Contructor with car details
    public Car(long vin, int Year, String Model){
        vinNumber = vin;
        year = Year;
        model = Model;        
    }
    
    //Method to set Miles
    public void setMileage(double Mileage){
        mileage = Mileage;
    }
    
    //Method to gather all the info and print
    public String getInfo(){
        return year + " " + model + " (VIN: " + vinNumber + ", mileage: " + mileage + " mile)";
    }
}
