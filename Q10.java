import java.util.Scanner;

public class diss1{

        public static void main(String[] args) {
                int a = Integer.parseInt(args[0]);
                int b = Integer.parseInt(args[1]);
                int c1 = a + (int)((b-a)*Math.random());
                int c2 = a + (int)((b-a)*Math.random());
                int c3 = a + (int)((b-a)*Math.random());
                int c4 = a + (int)((b-a)*Math.random());
                int c5 = a + (int)((b-a)*Math.random());
                System.out.println(c1);
                System.out.println(c2);
                System.out.println(c3);
                System.out.println(c4);
                System.out.println(c5);
                int min = Math.min(c1 , c2);
                min = Math.min(min , c3);
                min = Math.min(min , c4);
                min = Math.min(min , c5);
                int max = Math.max(c1 , c2);
                max = Math.max(max , c3);
                max = Math.max(max , c4);
                max = Math.max(max , c5);
                System.out.println("Minimum value is = " + min);
                System.out.println("Maximum value is = " + max);
        } 

}
