import java.util.Scanner;
public class SmallBig {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Imput three numbers");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();

		if((a < b) && (a < c)) {
			System.out.println(a + " is the smallest");		
		}
		else if((b < a)&&(b < c)) {
			System.out.println(b + " is the smallest");
		}
		else {
			System.out.println(c + " is the smallest");
		}
		
		

		if((a > b) && (a > c)) {
			System.out.println(a + " is the biggest");		
		}
		else if((b > a)&&(b > c)) {
			System.out.println(b + " is the biggest");
		}
		else {
			System.out.println(c + " is the biggest");
		}
		
		scanner.close();

	}

}
