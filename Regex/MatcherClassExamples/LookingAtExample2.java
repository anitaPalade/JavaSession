package MatcherClassExamples;

/*The Matcher lookingAt() method works like the matches() method with one major difference. 
 * The lookingAt() method only matches the regular expression against the beginning of the text, 
 * whereas matches() matches the regular expression against the whole text. In other words, 
 * if the regular expression matches the beginning of a text but not the whole text, lookingAt() will return true, 
 * whereas matches() will return false.
 * Here is a Matcher.lookingAt() example:
*/

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class LookingAtExample2 {

    public static void main(String[] args) {

        String text    = "This is the text to be searched for occurrences of the http:// pattern.";

        String patternString = "This is the";

        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        System.out.println("lookingAt = " + matcher.lookingAt());
        System.out.println("matches   = " + matcher.matches());
    }
}

/*This example matches the regular expression "this is the" against both the beginning of the text, and against the whole text.
 *  Matching the regular expression against the beginning of the text (lookingAt()) will return true.
 * Matching the regular expression against the whole text (matches()) will return false, because the text has more characters
 *  than the regular expression. The regular expression says that the text must match the text "This is the" exactly,
 *   with no extra characters before or after the expression.
 */   
