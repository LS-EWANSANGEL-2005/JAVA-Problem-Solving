package CoreJava;

public class WhileLoop {

	public static void main(String[] args) {
	int num=1025;
	int n=5;
	int count=0;
	while(num>=n) {
		count++;
		num=num/n;
	}
System.out.println(count);
	}

}
