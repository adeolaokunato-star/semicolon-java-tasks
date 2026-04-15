import java.util.Scanner;
public class Task18{
public static void main(String[] args){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter a number");
int number = inputCollector.nextInt();
int sum = number - 5;
System.out.println("The cube of " + number +  "is: " + sum);
}
}
