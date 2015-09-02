// AgeComparer.java
import java.util.Scanner;
public class AgeComparer {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		String name1;
		int age1;
		String name2;
		int age2;
		String result;
		int choice;
		
		System.out.println("Enter someone's name: ");
		name1 = scan.nextLine();
		System.out.println("How old is he/she? / When is his/her birthyear? ");
		age1 = scan.nextInt();
		System.out.println("Enter someone else's name: ");
		name2 = scan2.nextLine();
		System.out.println("How old is he/she? / When is his/her birthyear? ");
		age2 = scan.nextInt();
		System.out.println("Compare by: \n1.age \n2.birthyear?\n(Write the number)");
		choice = scan.nextInt();
		if (age1 == age2) {
			result = " The same age as ";
		}
		else if (choice == 1) {
			if (age1 > age2) {
				result = " older than ";
			}
			else {
				result = " younger than ";
			}
		}
		else if (choice == 2) {
			if (age1 < age2) {
				result = " older than ";
			}
			else {
				result = " younger than ";
			}
		}
		else {
			result = "ERROR!";
		}
		System.out.println(name1 + " is" + result + name2 + ".");
	}
}