import java.util.Scanner;

public class Areaofcircle {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        System.out.println("enter the value of radius:");
        float rad = in.nextFloat();
        in.close();

        float area = 0;
        
        System.out.println("the area of the circle with radius :" + rad);
        area = (22 / 7) * rad * rad;
        System.out.println(area);
    }
}
