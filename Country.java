
public class Country {

	String name;
	double population;
	double area;
	
	public Country(String name2, double population2, double area2) {
		
		name = name2;
		population = population2;
		area = area2;
		
	}
	public void ComparePop(Country p1, Country p2) {
		if( p1.population > p2.population ) {
			System.out.println(p1.name + " " +p1.population);			
		}
		else {
			System.out.println(p2.name + " " + p2.population);
		}
	

	}
	

}
