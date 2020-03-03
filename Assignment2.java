package Assignment2;

import java.util.ArrayList;

public class Assignment2 {
	
	public boolean allLettersAvailableOrNot(String text) {
		StringBuilder sb = new StringBuilder(text.toLowerCase());
		ArrayList<Character> alphabets = new ArrayList<Character>();
		for(int i=0;i<text.length();i++) {
			if(Character.isLetter(sb.charAt(i)) && !alphabets.contains(sb.charAt(i))) {
				alphabets.add(sb.charAt(i));
			}	
			if(alphabets.size() == 26)
				return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2 obj = new Assignment2();
		System.out.println("Checking whether the text 'qwertyuiopasdfghjklzxcvbnm' has every alphabet in it: " + obj.allLettersAvailableOrNot("qwertyuiopasdfghjklzxcvbnm"));
		System.out.println("Checking whether the text 'qwertyuiop' has every alphabet in it: " + obj.allLettersAvailableOrNot("qwertyuiop"));
		System.out.println("Checking whether the text 'qwertyuiopasdfghjklzxcvbN ABCDEF...' has every alphabet in it: " + obj.allLettersAvailableOrNot("qwertyuiopasdfghjklzxcvbN  ABCDEF..."));
	}
}

/* Time Complexity is: O(n)
 * Space Complexity is: O(n)
 */
