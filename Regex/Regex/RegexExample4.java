package Regex;

import java.util.regex.Pattern;
/*SPLIT
 * The split() method in the Pattern class can split a text into an array of String's, using the regular expression (the pattern) as delimiter.
 *  Here is a Java Pattern.split() example:
*/

public class RegexExample4 {

    public static void main(String[] args) {
    
        String text = "A sep Text sep With sep Many sep Separators";
        
        String patternString = "sep";
        Pattern pattern = Pattern.compile(patternString);
        
        String[] split = pattern.split(text);
        
        System.out.println("split.length = " + split.length);
        
        for(String element : split){
            System.out.println("element = " + element);
        }
    }
}

/*This Pattern.split() example splits the text in the text variable into 5 separate strings.
* Each of these strings are included in the String array returned by the split() method.
* The parts of the text that matched as delimiters are not included in the returned String array.
*/