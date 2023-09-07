import java.util.Scanner;

public class Simpleintrest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of P, R ,T :");
        float p = input.nextFloat();
        int r = input.nextInt();
        int t = input.nextInt();
        input.close();
        
        float si = (p * r * t)/100;

        System.out.println("Simple-Intrest is:" + si);

    }    
}
