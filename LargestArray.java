public class Array{
public static void main(String... args){
System.out.println(largest(new int[]{20, 100, 20}));
}
public static int largest(int[] array){
int largest = array[0];
for(int num =1; num < array.length; num++){
if(array[num] > largest){
largest = array[num];
}
}
return largest;
}
}
