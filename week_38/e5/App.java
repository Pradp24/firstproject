import java.util.Scanner;

public class App{
public enum Day{
MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the day of a week:");
        String dayInput= scanner.next().toUpperCase();
        Day day=Day.valueOf(dayInput);
        switch(day){
            case MONDAY:
            System.out.println("Start your week refreshly:");
            break;
            case TUESDAY:
            System.out.println("Work goes on:");
            break; 
            case WEDNESDAY:
            System.out.println("Work goes on:");
            break; 
            case THURSDAY:
            System.out.println(" Still Work goes on:");
            break; 
            case FRIDAY:
            System.out.println("Still Work goes on:");
            break; 
            case SATURDAY:
            System.out.println("Enjoy your weekend!!!:");
            break; 
            case SUNDAY:
            System.out.println("Get ready to start the start of the week freshly:");
            break;
            default:
            System.out.println("The given is invalid::");
        }
    }
}