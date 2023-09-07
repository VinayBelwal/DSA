import java.util.Scanner;

public class Evenodd{
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("enter the number to check even or odd : ");
    int num = input.nextInt();
    input.close();             //closing resourse leak...

    if(num % 2 == 0){
        System.out.println("even");
    }
    else{
        System.out.println("odd");
    }

}
}