import java.util.Scanner;

public class IT24103525Lab4Q2 
{
    public static void main(String[]args) 
  {
     
      //create a scanner object to read inputs
      Scanner input = new Scanner(System.in);
      
      System.out.print("Please enter exam marks (out of 100): ");
      //Take user input
      double Emark = input.nextDouble();
      if(Emark<=0||Emark<=100)
       {
        System.out.print("Please enter lab submission marks (out of 100): ");
        //Take user input
        double markL = input.nextDouble();

        if(markL<=0||markL<=100)
        {
         System.out.print("Please enter the percentage given for the exam: ");
         //Take user input
         double Pemark = input.nextDouble();

         System.out.print("Please enter the percentage given for the  lab submission: ");
         //Take user input
         double PmarkL = input.nextDouble();

         if(Pemark+PmarkL<=0||Pemark+PmarkL<=100)
        {
         //Displaying final marks
         System.out.print("\nFinal Exam Mark is: " + (Emark*(Pemark/100)+markL*(PmarkL/100)));

         }

         else
        {
        System.out.print("The percentage must add up to 100.Terminating program.");
        //End program here if statement is false
        }

      }
     
       else 
        {
         System.out.print("Invalid iput for exam marks.Terminating program.");
         //End program here if statement is false
         }
    
       }
     else 
       {
        System.out.print("Invalid iput for exam marks.Terminating program.");
        //End program here if statement is false
       }
   }
 
}

   
     

