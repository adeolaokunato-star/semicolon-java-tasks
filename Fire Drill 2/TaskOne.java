import java.util.Scanner;
public class TaskOne{
public static void main(String[] args){
int sum = 0;
Scanner inputCollector = new Scanner(System.in);
for(int count = 1; count <= 10; count ++){
System.out.println("Enter number: " + count);
int countInput = inputCollector.nextInt();
sum += count;
}
System.out.println("Total: " + sum);
}
}
