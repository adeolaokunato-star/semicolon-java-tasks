import java.util.Scanner;
public class Nokia {
public static void main(String[] args){
Scanner inputCollector = new Scanner(System.in);
System.out.println("***************************************");
System.out.println("WELCOME TO NOKIA 3310-THE HARDEST IN THE WORLD");
System.out.println("***************************************");
System.out.println("********************");
System.out.println("\tMAIN MENU");
System.out.println("********************");
System.out.println("1: PHONE BOOK📞️");
System.out.println("2: MESSAGES💬️");
System.out.println("3: CHAT📱️");
System.out.println("4: CALL REGISTER📲️");
System.out.println("5: TONES🎵️");
System.out.println("6: SETTINGS⚙️");
System.out.println("7: CALL DIVERT📳️");
System.out.println("8: GAMES👾️");
System.out.println("9: CALCULATOR🧮️");
System.out.println("10: REMINDERS📅️");
System.out.println("11: CLOCK⏰️");
System.out.println("12: PROFILES🚹️");
System.out.println("13: SIM SERVICES📶️");
System.out.println("*********************");
System.out.println("*********************");
System.out.println("ENTER :");
int choice = inputCollector.nextInt();
while(true){
switch(choice){
case 1 ->{
System.out.println("***************");
System.out.println("PHONEBOOK📞️");
System.out.println("***************");
System.out.println("1: Search");
System.out.println("2: Service Nos");
System.out.println("3: Add name");
System.out.println("4: Erase");
System.out.println("5: Edit");
System.out.println("6: Assign tone");
System.out.println("7: Send b'card");
System.out.println("8: Options");
System.out.println("9: Speed dials");
System.out.println("10: Voice tags");
System.out.println("ENTER :");
}
case 2 ->{
System.out.println("*********************");
System.out.println("MESSAGES💬️");
System.out.println("*********************");
System.out.println("1: Write messages");
System.out.println("2: Inbox");
System.out.println("3: Outbox");
System.out.println("4: Picture messages");
System.out.println("5: Templates");
System.out.println("6: Smileys");
System.out.println("*********************");
System.out.println("7: Message settings");
System.out.println("*********************");
System.out.println("*********************");
System.out.println("1: Set1");
System.out.println("*********************");
System.out.println("1: Message centre number");
System.out.println("2: Message sent as");
System.out.println("3: Message validity");
System.out.println("*********************");
System.out.println("2: Common");
System.out.println("*********************");
System.out.println("1: Delivery reports");
System.out.println("2: Reply via same centre");
System.out.println("3: Character support");
System.out.println("*********************");
System.out.println("8: Info service");
System.out.println("9: Voice mailbox number");
System.out.println("10: Service command editor");
System.out.println("ENTER :");
}
case 3 ->{
System.out.println("*********************");
System.out.println("CHAT📱️");
System.out.println("*********************");
System.out.println("1: Facebook");
System.out.println("2: Whatsapp");
System.out.println("3: 2go");
System.out.println("4: Messager");
System.out.println("5: Templates");
System.out.println("ENTER :");
}
case 4 ->{
System.out.println("*********************");
System.out.println("CALL REGISTER📲️");
System.out.println("*********************");
System.out.println("1: Missed calls");
System.out.println("2: Received calls");
System.out.println("3: Dailled numbers");
System.out.println("4: Erase recent call lists");
System.out.println("*********************");
System.out.println("SHOW CALL DURATION");
System.out.println("*********************");
System.out.println("1: Last call duration");
System.out.println("2: All calls duration");
System.out.println("3: Received calls duration");
System.out.println("4: Dialled calls duration");
System.out.println("5: Clear timers");
System.out.println("*********************");
System.out.println("SHOW CALL COSTS");
System.out.println("*********************");
System.out.println("1: Last call cost");
System.out.println("2: All calls cost");
System.out.println("3: Clear counters");
System.out.println("*********************");
System.out.println("CALL COST SETTINGS");
System.out.println("*********************");
System.out.println("1: Call cost limit");
System.out.println("2: Show costs in");
System.out.println("*********************");
System.out.println("Prepaid");
System.out.println("*********************");
System.out.println("ENTER :");
}
case 5 ->{
System.out.println("*********************");
System.out.println("TONES🎵️");
System.out.println("*********************");
System.out.println("1: Ringing tone");
System.out.println("2: Ringing volume");
System.out.println("3: Incoming call alert");
System.out.println("4: Composer");
System.out.println("5: Keypad tones");
System.out.println("6: Warning and the game tones");
System.out.println("7: Message alert tone");
System.out.println("8: Vibrating alert");
System.out.println("9: Screen saver");
System.out.println("ENTER :");
}
case 6 ->{
System.out.println("*********************");
System.out.println("SETTINGS⚙️");
System.out.println("*********************");
System.out.println("*********************");
System.out.println("1: CALL SETTINGS");
System.out.println("*********************");
System.out.println("1: Automatic redial");
System.out.println("2: Speed dialling");
System.out.println("3: Call waiting options");
System.out.println("4: Own number sending");
System.out.println("5: Phone line in use");
System.out.println("6: Automatic answer1");
System.out.println("*********************");
System.out.println("2: PHONE SETTINGS");
System.out.println("*********************");
System.out.println("1: Language");
System.out.println("2: Cell info display");
System.out.println("3: Welcome note");
System.out.println("4: Lights2");
System.out.println("5: Network selection");
System.out.println("6: Confirm SIM service actions");
System.out.println("*********************");
System.out.println("3: Security SETTINGS");
System.out.println("*********************");
System.out.println("1: PIN code request");
System.out.println("2: Call barring service");
System.out.println("3: Fixed dialling");
System.out.println("4: Closed user group");
System.out.println("5: Phone security");
System.out.println("6: Change access codes");
System.out.println("*********************");
System.out.println("4: Restory factory settings");
System.out.println("*********************");
System.out.println("*********************");
System.out.println("ENTER :");
}
case 7 ->{
System.out.println("*********************");
System.out.println("CALL DIVERT📳️");
System.out.println("*********************");
System.out.println("ENTER :");
}
case 8 ->{
System.out.println("*********************");
System.out.println("GAMES👾️");
System.out.println("*********************");
System.out.println("ENTER :");
}
case 9 ->{
System.out.println("*********************");
System.out.println("CALCULATOR🧮️");
System.out.println("*********************");
System.out.println("ENTER :");
}
case 10 ->{
System.out.println("*********************");
System.out.println("REMINDERS📅️");
System.out.println("*********************");
System.out.println("ENTER :");
}
case 11 ->{
System.out.println("*********************");
System.out.println("CLOCK⏰️");
System.out.println("*********************");
System.out.println("1: Alarm clock");
System.out.println("2: Clock settings");
System.out.println("3: Date setting");
System.out.println("4: Stopwatch");
System.out.println("5: Countdown timer");
System.out.println("6: Auto update of date and time");
System.out.println("ENTER :");
}
case 12 ->{
System.out.println("*********************");
System.out.println("PROFILES🚹️");
System.out.println("*********************");
System.out.println("ENTER :");
}
case 13 ->{
System.out.println("*********************");
System.out.println("SIM SERVICES📶️");
System.out.println("*********************");
System.out.println("ENTER :");
}
} 
}
}
}
