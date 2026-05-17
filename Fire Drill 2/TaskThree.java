import java.util.Scanner;
public class TaskThree{
public static void main(String[] args){
int sum = 0;
Scanner inputCollector = new Scanner(System.in);
for(int count = 1; count <= 10; count ++){
System.out.println("Enter number: ");
int countInput = inputCollector.nextInt();
sum = sum + countInput;
}
int average = sum / 10;
System.out.println("Total: " + average);
}
}
