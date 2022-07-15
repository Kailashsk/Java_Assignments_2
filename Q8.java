import java.util.Scanner;

public class diss1{

        public static void main(String[] args) {
                double P = Double.parseDouble(args[0]);
                double r = Double.parseDouble(args[1]);
                double t = Double.parseDouble(args[2]);
                System.out.print(P*Math.pow(Math.E,(r*t))); 
        } 

}
