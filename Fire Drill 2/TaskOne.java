import java.util.Scanner;
public class TaskOne{
public static void main(String[] args){
Scanner inputCollector = new Scanner(System.in);
int sum = 0;
for(int count = 1; count <= 10; count ++){
System.out.println("Enter number: " );
int countInput = inputCollector.nextInt();
sum = sum + countInput;
}
System.out.println("Total: " + sum);
}
}
