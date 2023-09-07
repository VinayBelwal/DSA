import java.util.Scanner;

public class Greet {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter your name:");
    String name = input.next();
    input.close();

    System.out.println(name);

    System.out.println("Hey!" + " " + name + ", " +"You are most welcomed here.");

}    
}
