package CoreJava;
import java.util.Scanner;
public class SpecialNumers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
         int lower=15;
         int high=45;
         int result;
         for(int i=lower;i<=high;i++) {
        	 int d1=i%10;
        	 int d2=i/10;
        	 int sum=d1+d2;
        	 int pro=d1*d2;
        	 result=sum+pro;
        	 if(result==i) {
        		 System.out.println(i);
        	 }
        	 
	}

}

}
