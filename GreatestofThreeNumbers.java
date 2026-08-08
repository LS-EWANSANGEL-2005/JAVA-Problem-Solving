package CoreJava;
import java.util.Scanner;
public class GreatestofThreeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter a Value:");
		a = sc.nextInt();
		System.out.println("Enter b Value:");
		b = sc.nextInt();
		System.out.println("Enter c Value:");
		c = sc.nextInt();
		if(a>b && a>c) {
			System.out.println("a is greater"+a);
		}else if(b>a && b>c) {
			System.out.println("b is greater"+b);
		}else {
			System.out.println("c is greater"+c);
		}
	}

}
