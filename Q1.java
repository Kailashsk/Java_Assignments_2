	import java.util.Scanner;
	
	public class diss1{
	
	        public static void main(String[] args) {
	        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
	        boolean res = (a%b==0 || b%a==0);
	        System.out.println("result=" + res);
	        }
	
	}
