import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day number( 1to 7)");
        int daynum=scanner.nextInt();
        switch (daynum){
            case 1:
            System.out.println("The day is Monday:");
            break;

            case 2:
            System.out.println("The day is Tuesday:");
            break;
            
            case 3:
            System.out.println("The day is Wednesday:");
            break; 
            
            case 4:
            System.out.println("The day is Thursday:");
            break; 

           
            case 5:
            System.out.println("The day is Saturday:");
            break;  
            
            case 6:
            System.out.println("The day is Sunday:");
            break;

            case 7:
            System.out.println("The day is Sunday:");
            break;

            default:
            System.out.println("The given input num is invalid: enter a valid num:");
            
        }
    }
}