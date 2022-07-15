import java.util.Scanner;

public class diss1{

        public static void main(String[] args) {
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[1]);
                int c = a + (int)((b-a)*Math.random());
                System.out.println("Result=" + c);
        } 

}
