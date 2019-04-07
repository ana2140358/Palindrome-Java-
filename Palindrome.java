//Programmer: Anan Aziz
//Class/ Instructor: CSC205AB/ Dilshad Haleem
//Assignment: Program verifies whether a user-input-String is a Palindrome
//Date: 10/26/18

/*
 * OUPUT
 * 
 * Please enter a String
 * racecar
 * racecar is a Palindrome
 * 
 * Please enter a String
 * economics
 * economics is not a Palindrome
 * economics in reverse is scimonoce
 */

/**
 * @author Anan Aziz
 * @version 1.1
 */

import java.util.*;

public class Palindrome {
	
	//Declared Stacks and Queues created for the program
	static Stack<Character> stakWithoutC;
	
	static Queue<Character> chain;
	
	static Queue<Character> line;
	
	static Queue<Character> echelon;
	
	static String reverse;
	
/**
 * Method verifies whether a user-input-String
 * is a Palindrome or not. If the String is Palindrome 
 * isPlaindrome() returns true. If the String
 * is not a Palindrome isPalindrome() returns
 * false and prints out the String in reverse order.
 *
 * @author Anan Aziz
 * @param String str
 * @return True or False
 */		
	public static boolean isPalindrome(String str)	{
		
		 stakWithoutC = new Stack<>();
		 
		 chain = new LinkedList<>();
		 
		 line = new LinkedList<>();

		/**
		* Strips all puntuations.
		*
		* @param s
		* @return
		*/
		//public static String stripPunctuation(String s) {			 
		 str = str.replaceAll("[.,<>?';:\"\\]\\[{}!@#$%^&*()_+-=]+", "");		 
		 str = str.replaceAll("\\s", "");
		//}
		
		//stackWithoutC & line is populated as the for loop
		//traverses through every character in the string		
		for(int i=0; i<str.length(); i++){
			stakWithoutC.push(str.charAt(i));
			line.add(str.charAt(i));			
		}
		
		//Queue created to store values temporarily before dequeing process
		Queue<Character> temporaryQueueNum1 = new LinkedList<>();
		
		//chain is populated with individual values from stakWithoutC
		for(int i=0; i<str.length(); i++){
			chain.add(stakWithoutC.pop());
		}
	
		//temporaryQueue1 is populated with topmost/ surface value of the chain queue
		for(int i=0; i<str.length(); i++){
			temporaryQueueNum1.add(chain.peek());
			chain.poll();
		}
		
		//Queue created to store values temporarily before dequeing process
		Queue<Character> temporaryQueueNum2 = new LinkedList<>();
		
		//temporaryQueueNum2 is populated with topmost/ surface values of line queue
		for(int i=0; i<str.length(); i++){
			temporaryQueueNum2.add(line.peek());
			line.poll();
		}
		
		echelon = new LinkedList(temporaryQueueNum1);
		
		//if temporaryQueueNum1 has the same values as temporaryQueueNum2
		//the string is a Palindrome.
		if(temporaryQueueNum1.equals(temporaryQueueNum2)){
			return true;
		} else
			return false;	
	}
}
