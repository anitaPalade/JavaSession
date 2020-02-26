package wrapperClass;

class WrapperImutable 
{ 
    public static void main(String[] args) 
    { 
        Integer i = new Integer(12); 
        System.out.println(i); 
        i = modify(i); 
//        i = i+1;
        System.out.println(i); 
    } 
  
    private static int modify(Integer i) 
    { 
        i = i + 1; 
        System.out.println(i); 
        return i;
    } 
} 