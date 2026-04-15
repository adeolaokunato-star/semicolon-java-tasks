import java.util.Scanner;

public class Task30{

public static void main(String[] args){

Scanner inputCollector = new Scanner(System.in); 

System.out.print("Enter seconds: ");

double total = inputCollector.nextDouble();

double hours    = total / 3600;

double minutes  = total / 60;

double seconds  = total / 60;

System.out.println(total + " seconds = "

+ hours + " hours, " + minutes + " minutes, " + seconds + " seconds");

}

}
