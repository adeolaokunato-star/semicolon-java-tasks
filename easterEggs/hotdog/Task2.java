import java.util.Scanner;
public class Task2{
public static void main(String[] args){
Scanner inputCollector = new Scanner(System.in);
System.out.print("Enter side length: ");
double side = inputCollector.nextDouble();
double area = (Math.sqrt(3) / 4) * side * side;
System.out.println("area = " + area);
}
}
