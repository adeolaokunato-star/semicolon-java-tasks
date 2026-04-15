import java.util.Scanner;
public class Task226{
public static void main(String[] agrs){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter pin: ");
int pin = inputCollector.nextInt();
long amount = 1_000_000_000;
if (pin == 1234){
System.out.println("Your balance is " + "$" + amount);
} else if (pin != 1234){
System.out.print("Incorrect pin Ole: ");
}
}
}
