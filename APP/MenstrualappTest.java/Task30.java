import java.util.Scanner;
public class Task30{
public static void main(String[] args){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter the First Number: ");
int FirstNumber = inputCollector.nextInt();
System.out.println("Enter the Second Number: ");
int SecondNumber = inputCollector.nextInt();
int sum = FirstNumber + SecondNumber;
int product = FirstNumber * SecondNumber;
System.out.println(sum + product);
System.out.println(sum * product);
}
}

