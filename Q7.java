import java.util.Scanner;

public class diss1{

        public static void main(String[] args) {
        int m=Integer.parseInt(args[0]);
        int d=Integer.parseInt(args[1]);

        boolean res=(((m==3)&&(d>20&&d<=31)) || ((m==4)&&(d>20 && d<=31)) || ((m==5) &&(d>20 && d<=30)) || ((m==6) && (d>20 && d<=31)));
        System.out.println("Result"+res);
        } 

}
