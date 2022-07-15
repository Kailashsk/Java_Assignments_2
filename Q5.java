import java.util.Scanner;

public class diss1{

        public static void main(String[] args) {
                double a = Double.parseDouble(args[0]);
                double b = Math.toRadians(a);
                double c = Math.sin(2*b) + Math.sin(3*b);
                System.out.println("Result=" + c);
        } 

}
