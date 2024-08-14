import java.util.Scanner;

public class IT24103525Lab4Q3 
{
    public static void main(String[]args) 
  { 
      //create a scanner object to read inputs
      Scanner input = new Scanner(System.in);
      
      //take user input
      System.out.print("Enter a number: ");
      double number = input.nextDouble();

      //Check number
      String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";

      //Display final output
      System.out.print("The Number is : " + result);
   
     }

}
    