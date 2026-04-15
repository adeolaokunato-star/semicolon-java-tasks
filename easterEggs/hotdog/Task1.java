import java.util.Scanner;
public class Task1{ 
public static void main(String[] args){
Scanner inputCollector = new Scanner(System.in);
System.out.print("Enter miles: ");
double miles = inputCollector.nextDouble();
double kilometers = miles * 1.6;
System.out.println(miles + " miles = " + kilometers + " kilometers");
}
}
