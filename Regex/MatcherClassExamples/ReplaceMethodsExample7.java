package MatcherClassExamples;

/*
 * The Matcher replaceAll() and replaceFirst() methods can be used to replace parts of the string the Matcher is searching through.
 *  The replaceAll() method replaces all matches of the regular expression. The replaceFirst() only replaces the first match.
 *  Before any matching is carried out, the Matcher is reset, so that matching starts from the beginning of the input text.
*/

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ReplaceMethodsExample7 {

    public static void main(String[] args) {

        String text    = "John writes about this, and John Doe writes about that, and John Wayne writes about everything.";

        String patternString1 = "((John) (.+?)) ";

        Pattern pattern = Pattern.compile(patternString1);
        Matcher matcher = pattern.matcher(text);

        String replaceAll = matcher.replaceAll("Joe Blocks ");
        System.out.println("replaceAll   = " + replaceAll);

        String replaceFirst = matcher.replaceFirst("Joe Blocks ");
        System.out.println("replaceFirst = " + replaceFirst);
    }
}

/*
 * Notice how the first string printed has all occurrences of John with a word after, replaced with the string Joe Blocks.
 *  The second string only has the first occurrence replaced.
 */ 
