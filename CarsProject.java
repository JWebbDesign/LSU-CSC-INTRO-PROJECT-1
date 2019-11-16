//Student Name: Jeremy Webb
//LSU ID: 89-893-8558
//Lab Section: 1
//Assignment: CarsProject
//Submission Time: 1:08pm

package carsproject;

import java.io.PrintWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;

public class CarsProject {

    public static void main(String[] args) throws FileNotFoundException{
        
        Car c1 = new Car(12313131, 2009, "Camry");
        c1.setMileage(60000);
        saveCarInfo(c1.getInfo());
        
        Car c2 = new Car(95645421, 2010, "Accord");
        c2.setMileage(95000);
        saveCarInfo(c2.getInfo());
        
        Car c3 = new Car(45746587, 2019, "CX5");
        c3.setMileage(600);
        saveCarInfo(c3.getInfo());
    }
    
    //Method prints the car info onto a txt File
    public static void saveCarInfo(String info)throws FileNotFoundException{

    PrintWriter outFile = new PrintWriter(new FileOutputStream(new File("carInfo.txt"), true));
    outFile.println(info);
    
    outFile.close();
    } 
}
