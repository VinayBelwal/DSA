import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("enter the alphabet:");
        char ch = input.next().charAt(0);         // .trim = used to cut extra space sidearound.  ,,  .charAt = used to choose a character at a selected index means 0,1,2,....
        input.close();
        
        if(ch <= 'a' && ch >= 'z'){
            System.out.println("lowercase");
        }
        else{
            System.out.println("uppercase");
        }
    }    
}
