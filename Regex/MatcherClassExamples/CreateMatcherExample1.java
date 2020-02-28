package MatcherClassExamples;

//Creating a Matcher is done via the matcher() method in the Pattern class. Here is an example:

	import java.util.regex.Pattern;
	import java.util.regex.Matcher;
	
public class CreateMatcherExample1 {

		public static void main(String[] args) {

		        String text  = "This is the text to be searched for occurrences of the http:// pattern.";

		        String patternString = ".*http://.*";

		        Pattern pattern = Pattern.compile(patternString);

		        Matcher matcher = pattern.matcher(text);
		        
		        /*the matcher variable will contain a Matcher instance which can be used to match the regular 
		         * expression used to create it against different text input.
		         */
		        
		        System.out.println(matcher);
		        
		        /*matches()
		         * The matches() method in the Matcher class matches the regular expression against the whole text passed to the Pattern.matcher()
		         *  method,when the Matcher was created. Here is a Matcher.matches() example:
		        */	

		        boolean matches = matcher.matches();
		       
		        /*If the regular expression matches the whole text, then the matches() method returns true.
		         *  If not, the matches() method returns false.
		         */
		        
		        System.out.println(matches);
		        
	 }
}


