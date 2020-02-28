package MatcherClassExamples;

/*(John) (.+?)
 * This expression matches the text "John" followed by a space, and then one or more characters. 
 * You cannot see it in the example above, but there is a space after the last group too.
 * This expression contains a few characters with special meanings in a regular expression.
 *  The . means "any character". The + means "one or more times", and relates to the . (any character, one or more times).
 *   The ? means "match as small a number of characters as possible".
*/

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class MultiGroupExample5 {

    public static void main(String[] args) {

        String text    =  "John writes about this, and John Doe writes about that, and John Wayne writes about everything.";

        String patternString1 = "(John) (.+?) ";

        Pattern pattern = Pattern.compile(patternString1);
        Matcher matcher = pattern.matcher(text);

        while(matcher.find()) {
            System.out.println("found: " + matcher.group(1) +
                               " "       + matcher.group(2));
        }
    }
}

/*
 * Notice the reference to the two groups, marked in bold. The characters matched by those groups are printed to System.out.
 */
