package CoreJava;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enate a :");
		float a=sc.nextFloat();
		System.out.println("Select Operator");
		char ch=sc.next().charAt(0);
		System.out.println("Ente b:");
		float b=sc.nextFloat();
		switch (ch) {
		 case '+':
			 System.out.println("Sum:"+(a+b));
			 break;
		 case '-':
			 System.out.println("Subtraction:"+(a-b));
			 break;
		 case '*':
			 System.out.println("Multiplication:"+(a*b));
			 break;
		 case '/':
			 System.out.println("Division:"+(a/b));
			 break;
		 case '%':
			 System.out.println("Percentage:"+(a%b));
			 break;
		}
	}

}
