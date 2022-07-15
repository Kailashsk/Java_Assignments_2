import java.util.Scanner;

public class diss1{

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Input temprature in farenheit:");
                double f = sc.nextDouble();
                double c = (((f-32)*5)/(9));
                System.out.println("The temprature in centigrade is = " + c);
        } 

}
