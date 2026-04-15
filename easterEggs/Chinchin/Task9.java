import java.util.Scanner;
public class Task9{
public static void main(String[] args){
Scanner lotteryNumber = new Scanner(System.in); 
System.out.println("Enter a lottery number: ");
int number = lotteryNumber.nextInt();
if (number <= 15 || number >= 18){
System.out.println("lost");
}
else if (number <= 15){
System.out.println("Won $1000");
} 
else if (number <= 16){
System.out.println("Won $10,000");
} 
else if (number <= 17){
System.out.println("Won $3000");
} 
}
}

