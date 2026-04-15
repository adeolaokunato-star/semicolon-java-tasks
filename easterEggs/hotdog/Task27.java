import java.util.Scanner;
public class Task27{
public static void main(String[] args){
Scanner inputCollector = new Scanner(System.in); 
System.out.print("Enter an integer: ");
int n = inputCollector.nextInt();
System.out.println(n + " is divisible by 2");
System.out.println(n + " is divisible by 3");
System.out.println(n + " is divisible by 5");
System.out.println(n + " is divisible by 7");
if (n % 2 == 0) 
if (n % 3 == 0) 
if (n % 5 == 0) 
if (n % 7 == 0)
if (n% 2 != 0 / n%3 != 0 / n%5 != 0 / n%7 != 0) {
System.out.println(n + " is not divisible by 2, 3, 5, or 7");
}
}
}

