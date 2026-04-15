import java.util.Scanner;
public class Task4{
public static void main(String[] args){
Scanner inputCollector = new Scanner(System.in);
System.out.print("Enter meters: ");
double meters = inputCollector.nextDouble();
double feet = meters * 3.2786;
System.out.println(meters + " meters = " + feet + " feet");
}
}
