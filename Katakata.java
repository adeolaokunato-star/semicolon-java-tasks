public class Katakata {
public static void main(String[] args){
java.util.Scanner input = new java.util.Scanner(System.in);
int[] num = new int[10];
for(int number = 0; number < num.length; number++){
System.out.println("Enter number: ");
num[number] = input.nextInt();
}
for(int number = 0; number < num.length; number++){
System.out.print("[" + num[number] + "]");
}
}
}
