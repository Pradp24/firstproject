import java.util.Scanner;

public class App{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the scored marks:");
        float num=scanner.nextFloat();
        if (num>=90) {
            System.out.println("Excellent! keep it up!!!!");
        } 
        else if(num>70 && num<90) {
            System.out.println("Good job!!");
            
        } 
        else if(num>50 && num<70){
            System.out.println("Needs improvement");
          }
          else{
            System.out.println("Sorry you failed try again:");
                     }
          scanner.close();
    }
}