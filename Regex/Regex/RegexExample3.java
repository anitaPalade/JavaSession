package Regex;


import java.util.regex.Pattern;
import java.util.regex.Matcher;

/*PATTERN COMPILE & MATCHER
 * Once you have obtained a Pattern instance, you can use that to obtain a Matcher instance. 
 * The Matcher instance is used to find matches of the pattern in texts. Here is an example of how to create a Matcher
 *  instance from a Pattern instance:
 *  Matcher matcher = pattern.matcher(text);
 *  The Matcher class has a matches() method that tests whether the pattern matches the text.
 *  Here is a full example of how to use the Matcher:
*/

public class RegexExample3 {
	public static void main(String[] args) {
		
		String text    =	"This is just an example sentance. Containing different is on various places like this is here and this is also here.";

        String patternString = "is";

        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(text);

        System.out.println(pattern.toString());
        while (matcher.find()) 
            System.out.println("Pattern found from " + matcher.start() + " to " + (matcher.end()-1));
    }
}
