import java.util.Scanner;

public class diss1{

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Input basic salary:");
                double bs = sc.nextDouble();
                double da = 0.4*bs;
                double hra = 0.2*bs;
                double gross = bs + da + hra;
                System.out.println("Gross salary of the employee is :"+ gross);
        } 

}
