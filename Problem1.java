package CoreJava;
import java.util.Scanner;
public class Problem1 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        System.out.println("Enter The name:");
        String name=in.nextLine();
        System.out.println("Enter Department Name:");
        String department=in.nextLine();
        System.out.println("Enter a CGPA:");
        Float CGPA=in.nextFloat();
        System.out.println("Enter your Register Number:");
        long register_number=in.nextLong();
        in.close();

        System.out.println("Name:"+name);
        System.out.println("Register Number:"+register_number);
        System.out.println("Department:"+department); 
        System.out.println("CGPA:"+CGPA);
	}

}
