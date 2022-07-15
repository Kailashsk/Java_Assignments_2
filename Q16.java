import java.util.Scanner;

public class diss1{

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Input length of rectangle:");
                double l = sc.nextDouble();
                System.out.println("Input breadth of rectangle:");
                double b = sc.nextDouble();
                System.out.println("Input radius of circle:");
                double r = sc.nextDouble();
                System.out.println("Area of rectangle =" + (l*b));
                System.out.println("Perimeter of rectangle =" + (2*(l+b)));
                System.out.println("Area of circle =" + (3.14*r*r));
                System.out.println("Circumference of circle =" + (2*3.14*r));
        } 

}
