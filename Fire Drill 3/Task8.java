        
import java.util.Scanner;
public class Task8{
public static void main(String[] args){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter a number to cube");
int number = inputCollector.nextInt();
int cube = number * number * number;
System.out.println("The cube of " + number +  "is: " + cube);
}
}
