public class Reverse{
public static int reserve(int number){
int num = 0;
int digits = 0;
while(number != 0){
num = number % 10;
digits = digits * 10 + num;
number = number / 10;
}
return digits;
}
public static boolean isPalindrome(int number){
boolean palindrome = false;
int num = 0;
int digits = 0;
while(number != 0){
num = number % 10;
digits = digits * 10 + num;
number = number / 10;
if(digits == number){
palindrome = true;
}
}
return palindrome;
}
public static void main(String[] args){
System.out.println(reserve(123));
System.out.print(isPalindrome(123));
}
}
