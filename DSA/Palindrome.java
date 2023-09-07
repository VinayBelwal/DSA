import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the number to check the palindrome");
        int num = in.nextInt();
        in.close();

        int temp = num;
        int ans = 0;

        while(num > 0){
            int rem = num % 10;

            num /= 10;

            ans = ans * 10 + rem;
        }
        if(ans == temp){
            System.out.println("The number is Palindrome");
        }else{
            System.out.println("the number is not palindrome");
        }
    }
}
