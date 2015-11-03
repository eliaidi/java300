package com.hephec.javase.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class RegularTest {
	
	@Test
	public void testPattern(){

        String patternString = "sep*";
        Pattern pattern = Pattern.compile(patternString);
        
        String pattern2 = pattern.pattern();
        System.out.println(pattern2);
	}
	@Test
	public void testSplit(){
		String text = "A sep Text sep With sep Many sep Separators";
		        
		        String patternString = "sep";
		        Pattern pattern = Pattern.compile(patternString);
		        
		        String[] split = pattern.split(text);
		        
		        System.out.println("split.length = " + split.length);
		        
		        for(String element : split){
		            System.out.println("element = " + element);
		        }
	}
	@Test
	public void testMatcher(){
		String text    =
	            "This is the text to be searched " +
	            "for occurrences of the http:// pattern.";

	        String patternString = ".*http://.*";

	        Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);

	        Matcher matcher = pattern.matcher(text);

	        boolean matches = matcher.matches();

	        System.out.println("matches = " + matches);
	}
	@Test
	public void testMatches1(){
		        String text    =
		            "This is the text to be searched " +
		            "for occurrences of the pattern.";

		        String pattern = ".*is.*";

		        boolean matches = Pattern.matches(pattern, text);

		        System.out.println("matches = " + matches);
		
	}

	@Test
	public void testCompile(){
		 String text    =
	                "This is the text to be searched " +
	                "for occurrences of the http:// pattern.";

	        String patternString = ".*http://.*";

	        Pattern pattern = Pattern.compile(patternString);
	        Pattern pattern1 = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
	        System.out.println(pattern.getClass());
	}
	@Test
	public void testMatches(){
		String text    =
		        "This is the text to be searched " +
		        "for occurrences of the http:// pattern.";

		String pattern = ".*http://.*";

		boolean matches = Pattern.matches(pattern, text);

		System.out.println("matches = " + matches);
	}
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
		    
		    /**
		     *  
		     *  found: 1 : 2 - 4
				found: 2 : 5 - 7
				found: 3 : 23 - 25
				found: 4 : 70 - 72

		     * */
		}
	}
}
