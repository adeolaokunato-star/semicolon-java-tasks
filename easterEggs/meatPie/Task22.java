import java.util.Scanner;
public class Task22{
public static void main(String[] agrs){
Scanner inputCollector = new Scanner(System.in);
System.out.print("Enter radius: ");
double userInput = inputCollector.nextDouble();
double sum = userInput * 2;
double area = sum * 3.142;
System.out.println("The area of radius is: " + area);
}
}
