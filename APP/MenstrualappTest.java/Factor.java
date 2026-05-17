import java.util.Scanner;
public class Factor{
public static void main(String[] args ){
Scanner inputCollector = new Scanner(System.in);
System.out.println("Enter power of number: ");
int number = inputCollector.nextInt();
for(int count = 1; count <= number; count++){
if(number % count == 0){
System.out.println(count);
}
}
}
}
