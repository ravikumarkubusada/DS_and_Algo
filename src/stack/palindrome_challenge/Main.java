package stack.palindrome_challenge;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
    	string = string.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
    	
    	System.out.println("org str: "+string);
    	LinkedList<Character> stack = new LinkedList<Character>();
    	
    	for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			stack.push(c);
		}
    	StringBuilder desc = new StringBuilder(); 
    	for (int i = string.length() - 1; i >= 0; i--) {
    		desc.append(stack.pop());
		}
    	System.out.println("rev str: "+desc);
    	
    	return string.equals(desc.toString());
    	
//    	return false;
    }
}
