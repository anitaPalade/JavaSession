package Interface;

interface Vehicle { 
    // all are the abstract methods. 
    void changeGear(int a); 
    void speedUp(int a); 
} 
  
class Bicycle implements Vehicle{    
    int speed; 
    int gear;       
     // to change gear 
    public void changeGear(int newGear){           
        gear = newGear; 
    } 
     // to increase speed 
    public void speedUp(int increment){          
        speed = speed + increment; 
    }      
    // to decrease speed     
    public void printStates() { 
         System.out.println("speed: " + speed + " gear: " + gear); 
    } 
} 
  
class Bike implements Vehicle {      
    int speed; 
    int gear;      
    // to change gear 
    public void changeGear(int newGear){           
        gear = newGear; 
    }       
    // to increase speed 
    public void speedUp(int increment){          
        speed = speed + increment; 
    }          
    public void printStates() { 
         System.out.println("speed: " + speed 
             + " gear: " + gear); 
    } 
      
} 
class MainClass {     
    public static void main (String[] args) {    
        // creating an instance of Bicycle    
        Bicycle bicycle = new Bicycle(); 
        bicycle.changeGear(2); 
        bicycle.speedUp(3); 
        
        System.out.println("Bicycle present state :"); 
        bicycle.printStates(); 
          
        // creating instance of the bike. 
        Bike bike = new Bike(); 
        bike.changeGear(1); 
        bike.speedUp(4); 
          
        System.out.println("Bike present state :"); 
        bike.printStates(); 
    } 
} 