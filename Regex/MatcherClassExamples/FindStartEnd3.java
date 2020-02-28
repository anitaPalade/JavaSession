package MatcherClassExamples;

/*The Matcher find() method searches for occurrences of the regular expressions in the text passed to the Pattern.matcher(text) method,
 *  when the Matcher was created. If multiple matches can be found in the text, the find() method will find the first, 
 *  and then for each subsequent call to find() it will move to the next match.
 *  The methods start() and end() will give the indexes into the text where the found match starts and ends.
 *   Actually end() returns the index of the character just after the end of the matching section. 
 *   Thus, you can use the return values of start() and end() inside a String.substring() call.
 *   Here is a Java Matcher find(), start() and end() example:
 */   

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class FindStartEnd3 {

    public static void main(String[] args) {

        String text    =
                "This is the text which is to be searched " +
                "for occurrences of the word 'is'.";

        String patternString = "is";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        int count = 0;
        while(matcher.find()) {
            count++;
            System.out.println("found: " + count + " : "
                    + matcher.start() + " - " + matcher.end());
        }
    }
}
