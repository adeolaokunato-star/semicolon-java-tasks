import java.util.Scanner;
public class Countdown{
public static void main(String[] args ){
Scanner inputCollector = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = inputCollector.nextInt();
while(number > 0){
System.out.println(number);
number--;
}
System.out.println("B L A S T O F F!🚀️!");
}
}
