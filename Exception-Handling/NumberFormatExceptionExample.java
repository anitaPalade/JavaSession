
public class NumberFormatExceptionExample {

  
    private static final String inputString = "120.600";   
      
    public static void main(String[] args) {  
        try {  
              int a = Integer.parseInt(inputString);  
           }
        catch(NumberFormatException ex)
        {  
            System.out.println("Invalid string in argumment");  
            //request for well-formatted string  
        }  
    }
}
