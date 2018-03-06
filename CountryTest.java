import java.util.Scanner;
public class CountryTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Imput the items for the first country");
		String a = scanner.nextLine();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		
		scanner.nextLine();
		
		System.out.println("Imput the items for the second country");
		String x = scanner.nextLine();
		double y = scanner.nextDouble();
		double z = scanner.nextDouble();
		
		Country p1 = new Country(a,b,c);
		Country p2 = new Country(x,y,z);
		
		p1.ComparePop(p1, p2);

	}

}
