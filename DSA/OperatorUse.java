// Simple use of operator without any functions.
import java.util.Scanner;

public class OperatorUse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of num1 and num2:-");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("Enter the value of the operator you want to perform (+, -, *, /, %) - ");
        char ch = input.next().charAt(0);
        input.close();

        int ans = 0;

        if(ch == '+'){
            ans = a + b;
        }
        else if(ch == '-'){
            ans = a - b;
        }
        else if(ch == '*'){
            ans = a * b;
        }
        else if(ch == '/'){
            ans = a / b;
        }
        else if(ch == '%'){
            ans = a % b;
        }

        System.out.println("Your Answer is:- "+ ans);
        
    }    
}
