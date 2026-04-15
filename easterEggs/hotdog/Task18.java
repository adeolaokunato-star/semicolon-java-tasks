import java.util.Scanner;
public class Task18{
public static void main(String[] args){
Scanner inputCollector = new Scanner(System.in); 
System.out.print("Enter balance: ");
double balance = inputCollector.nextDouble();
System.out.print("Enter annual rate (%): ");
double rate = inputCollector.nextDouble();
double interest = balance * (rate / 1200);
System.out.println("Monthly interest = $" + interest);
}
}


