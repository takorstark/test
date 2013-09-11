import java.util.Scanner;


public class main {
	public static void main(String[] args){
		
		System.out.println("Hello!!!");
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.print("Enter A: ");
		a = sc.nextInt();
		System.out.print("Enter B: ");
		b = sc.nextInt();
		
		System.out.println(a+b);
		sc.close();
	}
}
