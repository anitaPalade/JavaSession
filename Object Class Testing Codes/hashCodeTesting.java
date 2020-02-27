package objectClassTesting;

public class hashCodeTesting { 
    static int last_roll = 100;  
    int roll_no; 
    
    hashCodeTesting() { 
        roll_no = last_roll; 
        last_roll++; 
    } 
    
    /* Compares the given object to “this” object (the object on which the method is called). 
     * It gives a generic way to compare objects for equality. 
     * It is recommended to override equals(Object obj) method to get
     *  our own equality condition on Objects.*/
  
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		hashCodeTesting other = (hashCodeTesting) obj;
		if (roll_no != other.roll_no)
			return false;
		return true;
	}

	/*For every object, JVM generates a unique number which is hashcode.
	 *  It returns distinct integers for distinct objects. JVM(Java Virtual Machine) uses hashcode
	 *   method while saving objects into hashing related data structures like HashSet, HashMap, 
	 *   Hashtable etc. 
	 *   The main advantage of saving objects based on hash code is that searching becomes easy. */
	
	@Override
	public int hashCode() {
		final int prime = 11;
		int result = 1;
		result = result + roll_no * prime;
		return result;
	} 
	
	/*toString() provides String representation of an Object and used to convert an object to String.
	 * return getClass().getName() + "@" + Integer.toHexString(hashCode());*/
	
	@Override
	public String toString() {
		return "Samething [roll_no=" + roll_no + "] ";
	}
	
    public static void main(String args[]) { 
    	hashCodeTesting s = new hashCodeTesting(); 
    	hashCodeTesting b = new hashCodeTesting(); 
    	
        System.out.println(s.hashCode()); 
        System.out.println(b.hashCode());
        
        
        System.out.println("\n"+s.equals(b));
        
        System.out.println(s.toString());
        System.out.println(b.toString());
        
    } 
} 
