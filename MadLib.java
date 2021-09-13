import java.util.Scanner;
public class MadLib {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Welcome the user.
        System.out.println("Hello! Welcome to the Mad Lib!");
        
        System.out.println("What's your name?");
        String userName = input.next();
        
        System.out.println("How old are you?");
        int userAge = input.nextInt();
        
        System.out.println("Wow! " + userName + " is " + userAge + " years old!");    
    }
}