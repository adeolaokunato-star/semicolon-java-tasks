import java.util.Scanner;
public class Pattern{
public static void main(String[] args){
Scanner inputCollector = new Scanner(System.in);
System.out.print("Enter number of rows you want: ");
int number = inputCollector.nextInt();
for(int row = 1; row <= number; row++){
for(int innerrow = 1; innerrow <= number - row; innerrow++){
System.out.print(" ");
}
for(int count =1; count <= row; count++){
System.out.print("*");
}
System.out.println();
}  
}
}
