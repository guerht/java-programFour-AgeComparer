// Comparer.java
import java.util.Scanner;
public class Comparer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1;
		int n2;
		System.out.println("Write the first integer: ");
		n1 = scan.nextInt();
		System.out.println("Write the second integer: ");
		n2 = scan.nextInt();
		System.out.println("Is the first number greater than the second number? \n\n"+(n1 > n2));
	}
}