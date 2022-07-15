import java.util.Scanner;

public class diss1{

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Input total number of eggs :");
                int total = sc.nextInt();
                int gross = total/144;
                int x = gross*144;
                int left = total - x;
                int dozen = left/12;
                int extra = left%12;
                System.out.println("Your number of eggs is " + gross +" gross, " + dozen + " dozen, and " + extra + ".");
        } 

}
