import java.util.Scanner;
public class Pattern{
public static void main(String[] args){
Scanner inputCollector = new Scanner(System.in);
System.out.print("Enter number of rows you want: ");
int number = inputCollector.nextInt();
for(int row = 1; row <= number; row++){
for(int innerrow = number; innerrow >= 1; innerrow--){
if (innerrow <= row){
System.out.print("*");
}else{
System.out.print(" ");
}
}
System.out.println();
}  
}
}
