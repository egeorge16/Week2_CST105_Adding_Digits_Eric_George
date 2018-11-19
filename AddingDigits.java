import java.util.Scanner; 

/**Program: Adding Digits
 * File: AddingDigits.java
 * Summary: User inputs a number and the digits are 
 *   added together and displayed to the user.
 * Author: Eric George
 * Date: November 18, 2018
 */
public class AddingDigits { 
  public static void main(String[] Strings) { 
  Scanner input = new Scanner(System.in); //Create scanner input

  System.out.print("Input an integer: "); //Ask user for input integer

  int num = input.nextInt(); //Input number used for algorithm
 
  //Find remainder of first digit when divided by 10 because it is a single digit between 0 and 10 
  int firstDigit = num % 10; 
  //Declare variable remainingNumber
  int remainingNumber = 0;
  //Repeat first number equation for second digit
  int SecondDigit = remainingNumber % 10; 
  //Divide remaining number by 10 
  remainingNumber = remainingNumber / 10; 
  //Repeat first number equation for third digit
  int thirdDigit = remainingNumber % 10; 
  //Take remaining number and divide by 10 again
  remainingNumber = remainingNumber / 10; 
  //Repeat first number question for fourth digit
  int fourthDigit = remainingNumber % 10; 
  //Calculate Sum of all digits
  int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit; 
  System.out.println("The sum of all digits in " + num + " is " + sum); 
  } 
} 