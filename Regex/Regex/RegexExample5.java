package Regex;


/*
* The pattern() method of the Pattern class simply returns the pattern string (regular expression) that the Pattern instance was compiled from.
* Here is an example:
*/
import java.util.regex.Pattern;

public class RegexExample5 {

    public static void main(String[] args) {
    
        String patternString = "sep";
        Pattern pattern = Pattern.compile(patternString);
        
        String pattern2 = pattern.pattern();
        
        System.out.print(pattern2);
    }
}

/*
 * In this example the pattern2 variable will contain the value sep, which was the value the Pattern instance was compiled from
 */
