import java.util.Scanner;

public class Rupeetodollar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float rupees;
        System.out.println("Enter the vlaue in rupees:");
        rupees = input.nextFloat();
        input.close();

        float dollar = rupees / 80;

        System.out.println(dollar +"$");
    }    
}
