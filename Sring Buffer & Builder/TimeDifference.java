
public class TimeDifference {
	public static void main(String[] args) {
		long startTime;
		int i;
		String str="Hello";

		//Using Strings
		 startTime = System.currentTimeMillis();	
		 for(i=1 ; i<=10000 ;i++) {
			 str.concat("world");
		 }
		 System.out.println(System.currentTimeMillis() - startTime+" ms"+" String");	//Calculating time of execution
		 
		 //Using Buffer
		 startTime = System.currentTimeMillis();
		
		 for(i=1 ; i<=100000 ;i++) {
			 StringBuffer s1 = new StringBuffer(str);
			 s1.append("World");
		 }
		 System.out.println(System.currentTimeMillis() - startTime+" ms"+" String Buffer");	//Calculating time of execution
		 
		 //Using Builder
		 startTime = System.currentTimeMillis();
		
		 for(i=1 ; i<=100000 ;i++) {
			 StringBuilder s2 = new StringBuilder(str);
			 s2.append("world");
		 }
		 System.out.println(System.currentTimeMillis() - startTime+" ms"+" String Builder");  //Calculating time of execution
	}
}
