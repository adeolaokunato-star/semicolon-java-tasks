import java.util.Scanner;
public class TaskFour{
public static void main(String[] args){
int number [] = {1, 2, 3, 4, 5};
EvenNumber(number);
}
public static void EvenNumber(int number []){
int count = 0;
for(int index = 0; index < number.length; index++){
if(number[index] % 2 == 0){
count++;
}
int EvenNumber = new int[count];
for(int i = 0; i < count.length; i++){
System.out.println(count[i]);
}
}
}
}
