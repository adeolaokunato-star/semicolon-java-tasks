import java.util.Scanner;
public class Task9{
public static void main(String[] args){
Scanner inputCollector = new Scanner(System.in);
System.out.print("What is your favorite color?");
String userInput = inputCollector.nextLine();
System.out.printf("Your favorite color is: %s!!%n", userInput);
}
}
