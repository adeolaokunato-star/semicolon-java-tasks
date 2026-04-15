public class Yomi{
public static void main(String[] args){
System.out.println("| * * * * * * |");
System.out.println("| * B I G * * |");
System.out.println("| * * * * * * |");
System.out.println("| * Y O M I * |");
System.out.println("| * * * * * * |");
int i = 100;
while(i >= 1){
if(i % 2 == 0)
System.out.print(i + " Even ");
if(i % 2 != 0)
System.out.print(i + " Odd ");
if(i % 4 == 0)
System.out.print("Hurray");
i--;
System.out.println();
}
}
}
