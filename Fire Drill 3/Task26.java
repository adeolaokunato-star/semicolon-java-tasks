import java.util.Scanner;
public class Task26{
public static void main(String[] args){
Scanner inputCollector = new Scanner(System.in); 
System.out.println("What is your name");
String name = inputCollector.nextLine();
System.out.println("How old are you");
String age = inputCollector.nextLine();
System.out.printf("I am %s and i am %s", name, age);
}
}

