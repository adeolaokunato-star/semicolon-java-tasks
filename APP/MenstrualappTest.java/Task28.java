import java.util.Scanner;
public class Task28{
public static void main(String[] args){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter a number");
int number = inputCollector.nextInt();
int sum = number / 3;
System.out.println("The devision of " + number +  "is: " + sum);
}
}
