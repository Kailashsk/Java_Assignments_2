import java.util.Scanner;

public class diss1{

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
            System.out.println("Input number of 25 paisa coins:");
            double p25 = sc.nextDouble();
            System.out.println("Input number of 50 paisa coins:");
            double p50 = sc.nextDouble();
            System.out.println("Input number of 1 rupee coins:");
            double r1 = sc.nextDouble();
            double total = (0.25*p25)+(0.5*p50)+(1*r1);
            System.out.println("Total amount present=" + total);
        } 

}
