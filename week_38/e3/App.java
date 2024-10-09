import java.util.Scanner;


public class App{
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = scanner.nextInt();
        System.out.println("Is it the weekend(True/False??)");
        boolean isWeekend= scanner.nextBoolean();
        if((age<18 || age>65) && !isWeekend){
            System.out.println("Congratulation !!!!You get discount");
        }
        else{
            System.out.println("Sorry you are getting any discount");
        }
        scanner.close();
    }
}