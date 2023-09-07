import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter to check the number is amstrong or not:");
        int num = in.nextInt();
        in.close();

        int temp = num;
        int ans = 0;

        while(num > 0){
            int rem = num % 10;

            ans = ans + (rem * rem * rem);

            num /= 10;
        }
        if(ans == temp){
            System.out.println("the number is amstrong");
        }else {
            System.out.println("the number is not amstrong");
        }
    }    
}
