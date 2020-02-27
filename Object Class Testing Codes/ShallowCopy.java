package objectClassTesting;

/*In Java, when the cloning process is done by invoking the clone() method it is called Shallow Cloning.
It is the default cloning process in Java where a shallow copy of the original object will be created with exact field.
In case the original object has references to some other objects as fields, 
then only the references of that object will be cloned instead of new object creation.
In other words, if you change the value of the cloned objects then it will be reflected in the original as well.
Thus, shallow cloning is dependent on the original object.
*/

class Cars
{
    String car1; 
    String car2;
    String car3;
  
    public Cars(String car1, String car2, String car3)
    {
        this.car1 = car1;
  
        this.car2 = car2;
  
        this.car3 = car3;
    }
}
  
class Driver implements Cloneable
{
    int driverId; 
    String driverName; 
    Cars cars;
  
    public Driver(int driverId, String driverName, Cars cars)
    {
        this.driverId = driverId; 
        this.driverName = driverName; 
        this.cars = cars;
    }
  
    //Default version of clone() method
  
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
  
public class ShallowCopy
{
    public static void main(String[] args)
    {
        Cars cars = new Cars("Kia", "Toyota", "Mitsubushi");
  
        Driver driver1 = new Driver(2811, "Max", cars);
  
        Driver driver2 = null;
  
        try
        {
            //Creating a clone of driver1 and assigning it to driver2
  
            driver2 = (Driver) driver1.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
         
        //Printing Details of driver1
        System.out.println("Details of driver 1: ");
        System.out.println("Id: "+driver1.driverId);
        System.out.println("Name: "+driver1.driverName);
        System.out.println("Car Id: "+driver1.cars.hashCode());
         
        //Printing all the courses of 'driver1'
        System.out.println("\nCars of driver 1: ");
        System.out.println(driver1.cars.car1);
        System.out.println(driver1.cars.car2);
        System.out.println(driver1.cars.car3);
         
      //Printing Details of driver2
        System.out.println("\nDetails of driver 2: ");
        System.out.println("Id: "+driver2.driverId);
        System.out.println("Name: "+driver2.driverName);
        System.out.println("Car Id: "+driver2.cars.hashCode());
         
         
      //Printing all the courses of 'driver2'
        System.out.println("\nCars of driver 2: ");
        System.out.println(driver2.cars.car1);
        System.out.println(driver2.cars.car2);
        System.out.println(driver2.cars.car3);       
  
        //Changing the car3 of 'driver2' 
        driver2.cars.car3 = "Maruti";

        //This change will be reflected in original 'driver1' 
        System.out.println("\nUpdated cars of driver 2: ");
        System.out.println(driver1.cars.car1);
        System.out.println(driver1.cars.car2);
        System.out.println(driver1.cars.car3);
        
        System.out.println(driver2.cars.car3);
        
        System.out.println("\nDriver2 Name: "+driver1.driverName);
        System.out.println("\nDriver2 Name: "+driver2.driverName);
        
        driver2.driverName = "Aang";
        	
        System.out.println("\nDriver1 Name: "+driver1.driverName);
        System.out.println("\nDriver2 Name: "+driver2.driverName);
        
        
    }
}