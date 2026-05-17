import java.util.Scanner;
public class Welcome{
public static void main(String[] args){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter the First Number:");
int FirstNumber = inputCollector.nextInt();
System.out.println("Enter the Second Number:");
int SecondNumber = inputCollector.nextInt();
System.out.println("Firstnumber: * Secondnumber:");
int product = FirstNumber * SecondNumber;
if (FirstNumber > SecondNumber){
System.out.println(FirstNumber);
}else {
System.out.println( "The large number is: " +SecondNumber);
}
}
}
