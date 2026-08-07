package CoreJava;
import java.util.Scanner;
public class CalculatorUsingIFELSEIF {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enate a :");
		float a=sc.nextFloat();
		System.out.println("Select Operator");
		char ch=sc.next().charAt(0);
		System.out.println("Ente b:");
		float b=sc.nextFloat();
        if(ch=='+') {
        	System.out.println(a+b);
        }else if(ch=='-') {
        	System.out.println(a-b);
        }else if(ch=='*') {
        	System.out.println(a*b);
        }else if(ch=='/') {
        	System.out.println(a/b);
        }else {
        	System.out.println("Invalid");
        }
	}

}
