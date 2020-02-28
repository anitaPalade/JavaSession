package Regex;

import java.util.regex.Pattern;

public class RegexExample1 {

		public static void main(String[] args) {

		String text    = "This is the text to be searched for occurrences of the pattern.";
		
		
		
		String pattern = ".*is.*";
		
		boolean matches = Pattern.matches(pattern, text);

		System.out.println("matches = " + matches);
	}
}

/* 
This Pattern.matches() example searches the string referenced by the text variable for an occurrence of the word "is",
 allowing zero or more characters to be present before and after the word (the two .* parts of the pattern).
The Pattern.matches() method is fine if you just need to check a pattern against a text a single time, 
and the default settings of the Pattern class are appropriate.
If you need to match for multiple occurrences, and even access the various matches, or just need non-default settings,
 you need to compile a Pattern instance using the Pattern.compile() method
*/
