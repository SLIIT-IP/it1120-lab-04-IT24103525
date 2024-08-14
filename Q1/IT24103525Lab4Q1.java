import java.util.Scanner;

public class IT24103525Lab4Q1 
{
    public static void main(String[]args) 
  { 
      //create a scanner object to read inputs
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a number: ");
      //Reading user input
      double number = input.nextDouble();
     
     //Check number
     if(number>0) 
     {
      System.out.println("The Number is : Positive");
     }

     else if(number<0)
     {  
      System.out.println("The Number is : Negative");
     }
           
     else
     {
      System.out.println("The Number is : Zero");
     }
     
  }

}
    