import java.util.Scanner;

public class Largest {    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        in.close();

        //1st
        /* 
        int max = a;
         if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        */

        //2nd
       /* 
            int max = 0;

            if(a > b){
                max = a;
            }
            else{
                max = b;
            }
            if(c > max){
                max =c;
            }
        */ 

        //3rd : using Math.max class

        int max = Math.max(c, Math.max(a , b));

        System.out.println("the largest number is:" + max);
    }
}
