import java.util.Scanner;
public class Average{
public static void main(String[] args ){
Scanner inputCollector = new Scanner(System.in);
int sum = 0;
int count = 0;
while(true){
System.out.println("Enter a number (negative to stop): ");
int number = inputCollector.nextInt();
if(number < 0)
break;
sum += number;
count++;
}
int average = sum / count;
System.out.println("The sum is: " + sum);
System.out.println("The average is: " + average);
}
}

