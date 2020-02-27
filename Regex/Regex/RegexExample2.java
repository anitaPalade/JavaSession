package Regex;

import java.util.regex.*;

public class RegexExample2 {
	
	    @SuppressWarnings("unused")
		public static void main(String[] args) {

	        String text    = "This is the text to be searched for occurrences of the http:// pattern.";

	        String patternString = ".*http://.*";

	        Pattern pattern = Pattern.compile(patternString); 
	        
	        System.out.println(pattern.toString());
	        
	    }
}

/*You can also use the Pattern.compile() method to compile a Pattern using special flags. Here is a Java Pattern.compile() 
* example using special flags:
* Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
* The Java Pattern class contains a list of flags (int constants) that you can use to make the Pattern matching behave in certain ways.
* The flag used above makes the pattern matching ignore the case of the text when matching. For more information of the flags you can use
* with the Java Pattern class, see the JavaDoc for Pattern
*/