package CoreJava;
import java.util.Scanner;
public class FinancialStatus {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
        if(num>0) {
        	System.out.println("Profit");
        }else if(num<0) {
        	System.out.println("Loss");
	    }else {
		System.out.println("No Profit or Loss");
	}

}
}
