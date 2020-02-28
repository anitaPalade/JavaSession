package Regex;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//extract numbers from a string 
public class TestingRegex {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Integer> numbers = new LinkedList<Integer>();
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(input.nextLine()); 
		while (m.find()) {
		  numbers.add(Integer.parseInt(m.group()));
		}
		System.out.println(numbers.toString());
	}
}
