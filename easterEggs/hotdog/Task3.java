import java.util.Scanner;
public class Task2{
public static void main(String[] args){
Scanner inputCollector = new Scanner(System.in);
System.out.print("Enter side of triangle: ");
double side = inputCollector.nextDouble();
System.out.print("Enter length of prism: ");
double length = inputCollector.nextDouble();
double area   = length;
double volume = area * length;
System.out.println("Volume = " + volume);
}
}

