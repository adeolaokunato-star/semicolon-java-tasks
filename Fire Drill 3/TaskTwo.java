import java.util.Scanner;
import java.util.Arrays;
public class TaskTwo{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
int number[] = new int[10];
for(int i = 0; i <= number.length-1; i++){
System.out.print("Enter number: ");
int numbers = input.nextInt();
number[i] = numbers;
System.out.print(Arrays.toString(number));
}
}
}
