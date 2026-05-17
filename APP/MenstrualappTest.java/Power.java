import java.util.Scanner;
public class Power{
public static void main(String[] args ){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter power of number: ");
int number = inputCollector.nextInt();
int power = 2;
for(int count = 1; count <= number; count++){
System.out.println(power);
power = power * 2;
}
}
}
