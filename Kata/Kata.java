public class Kata{
public static void main(String[] args){
maximum (5, 10);
even (20);
prime (17);
//subtract (10, 7);
//divide (20, 12);
//factor (20);
//perfectsquare (52302);
//palindrone (25);
//factorof (10);
//squareof (10);
}
public static int maximum(int firstNumber, int secondNumber){
int largest = 0;
if (firstNumber > secondNumber){
largest = firstNumber;
}
else {
largest = secondNumber;
}
System.out.println("Enter a maximum: " + largest);
return largest;
}
public static boolean even(int number){
if(number % 2 == 0){
System.out.println("True");
return true;
}
else {
System.out.println("False");
return false;
}
}
public static boolean prime(int number){
int num = 2;
for(;num > number ; ){
number++;
}
if(number / num != 0){
System.out.println("True");
return true;
}
else {
System.out.println("False");
return false;
}
}
}

