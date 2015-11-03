package com.hephec.javase.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class MatcherTest {
	
	@Test
	public void testFind(){
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

	//lookAt() method
	@Test
	public void testLookAt(){
		
		
		/**
		 * note:
		 * 
		 * The Matcher lookingAt() method works like the matches() method with one major difference. 
		 * The lookingAt() method only matches the regular expression against the beginning of the text
		 * whereas matches() matches the regular expression against the whole text. In other words
		 * if the regular expression matches the beginning of a text but not the whole text,
		 * lookingAt() will return true, whereas matches() will return false.
		 * 
		 * */
        String text    =
                "This is the text to be searched " +
                "for occurrences of the http:// pattern.";

        String patternString = "This is the";

        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        System.out.println("lookingAt = " + matcher.lookingAt());
        System.out.println("matches   = " + matcher.matches());
	}
	
	@Test
	public void note(){
		/**
		 * Java Matcher Example
			Creating a Matcher
			matches()
			lookingAt()
			find() + start() + end()
			reset()
			group()
			Multiple Groups
			Groups Inside Groups
			replaceAll() + replaceFirst()
			appendReplacement() + appendTail()
			
		 * */
	}
	
	
	//create a matcher
	@Test
	public void testMatches(){
		 String text    =
		            "This is the text to be searched " +
		            "for occurrences of the http:// pattern.";

		        String patternString = ".*http://.*";

		        Pattern pattern = Pattern.compile(patternString);
		        
		        Matcher matcher = pattern.matcher(text);
		        
		        //matches() method
//		        boolean matches = matcher.matches();
//		        String patternString = ".*http://.*";
//		        Pattern pattern = Pattern.compile(patternString);
//
//		        boolean matches = matcher.matches();
	}
}
