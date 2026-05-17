import java.util.Scanner;
public class TaskFour{
public static void main(String[] args){
Scanner inputCollector = new Scanner(System.in);
int sum = 0;
for(int count = 1; count <= 10; count ++){
System.out.println("Enter number: " );
int countInput = inputCollector.nextInt();
if ( count % 2 == 0){
}
countInput += count;
}
System.out.println("Total: " + sum);
}
}
