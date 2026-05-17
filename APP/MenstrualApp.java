import java.util.Scanner;
public class MenstrualApp {
 public static int[] asiko(String inputDate) {
    Scanner finkosi = new Scanner(inputDate);
    int year  =  finkosi.nextInt();
    int month =  finkosi.nextInt();
    int day   =  finkosi.nextInt();
    return new int[]{ year, month, day };
}
    public static void main(String[] args) {
       Scanner tibo = new Scanner(System.in);
        System.out.println("***************************************");
        System.out.println("WELCOME TO YOMI MINI MENSTURAL APP--WE CARE FOR OUR LADIES");
        System.out.println("***************************************");
        System.out.println("Enter your name?: ");
        String name = tibo.nextLine();
        System.out.println("Welcome " + name);
        System.out.print("Enter last period date (YYYY MM DD): ");
        String inputDate = tibo.nextLine();    
        int[] date = asiko(inputDate);
        int year  = date[0];
        int month = date[1];
        int day   = date[2];
        System.out.print("Enter average cycle length in days: ");
        int cycleLength = tibo.nextInt();
        day += cycleLength;
        while (day > 30) {
            day = day - 30;
            month++;
        }
        while (month > 12) {
            month = month - 12;
            year++;
        }
        int ovulationDay   = day - 14;
        int ovulationMonth = month;
        int ovulationYear  = year;

        while (ovulationDay <= 0) {
            ovulationDay = ovulationDay + 30;
           ovulationMonth--;
            if (ovulationMonth <= 0) {
               ovulationMonth = 12;
                ovulationYear--;
            }
        }
        System.out.println("***************************************");
        System.out.println("Results");
        System.out.println("***************************************");
        System.out.printf("Next Period Date:     %d-%d-%d%n", year, month, day);
        System.out.printf("Estimated Ovulation: %d-%d-%d%n",  ovulationYear, ovulationMonth, ovulationDay);
    }
}
