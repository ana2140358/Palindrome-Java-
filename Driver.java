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

public class Driver {
	
/**
* Driver class to test out isPalindrome
* method. The Driver class accepts user-input-String
* and feeds it to the isPalindrome method.
*
* @author Anan Aziz
* @return void
*/	
	public static void main(String[] args){
		
		
					//Prompts user to input a String					
					System.out.println("Please enter a String");
					
					Scanner keyboard = new Scanner(System.in);
					
					//Takes in user-input-String
					String str = keyboard.nextLine();
					
					//User input-String is fed to isPalindrome()
					//isPalindrome() verifies the String
					
					//if Palindrome prints out the statement below
					if(Palindrome.isPalindrome(str)){
						System.out.println(str + " is a Palindrome");
					}
					//if not Palindrom prints out the statement below
					else{
						System.out.println(str + " is not a Palindrome.");
						System.out.print(str + " in reverse is ");
						for(int i=0; i<str.length(); i++){							
							//Prints out user-input-String in reverse order
							System.out.print(Palindrome.echelon.poll());
						}					
					}		
	}
}