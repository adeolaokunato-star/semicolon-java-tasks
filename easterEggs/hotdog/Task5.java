import java.util.Scanner;
public class Task5{
public static void main(String[] args){
Scanner inputCollector = new Scanner(System.in); 
System.out.print("Enter square meters: ");
double Squaremeter = inputCollector.nextDouble();
double ping = Squaremeter * 0.3025; 
System.out.println(Squaremeter  + "Squaremeter  = " + ping + " ping");
}
}
