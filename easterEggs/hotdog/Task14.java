import java.util.Scanner;
public class Task14{
public static void main(String[] args){
Scanner inputCollector = new Scanner(System.in); 
System.out.println("Enter square meters: ");
double squaremeters = inputCollector.nextDouble();
System.out.println("Enter weight in pounds: ");
double pounds = inputCollector.nextDouble();
System.out.print("Enter height in inches: ");
double inches = inputCollector.nextDouble();
double kg  = pounds * 0.45359237;
double meters   = inches * 0.0254;
double bmi = kg / (meters * meters);
System.out.println("Your BMI = " + bmi);
}
}
