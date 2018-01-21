import java.util.*;
/**
 * Techniki konstrukcji obiekt�w
 * @author dagor
 *
 */
public class ConstructorTest {

	public static void main(String[] args) {
		// wstawienie do tablicy staff trzech obiekt�w klasy Employee
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Hubert", 40000);
		staff[1] = new Employee(60000);
		staff[2] = new Employee();
		
		// wydruk informacji o wszystkich obiektach klasy Employee
		
		for (Employee e : staff) {
			System.out.println("Name = "+e.getName()+", id = "+e.getId()+", salary = "+e.getSalary());
		}

	}

}

class Employee {
	private static int nextId;
	
	private int id;
	private String name = "";	// inicjalizacja zmiennej sk�adowej obiektu
	private double salary;
	
	// statyczny blok inicjuj�cy
	static {
		Random generator = new Random();
		// ustawienie zmiennej nextId na losow� liczb� ca�kowit� z przedzia�u 0 - 9999
		nextId = generator.nextInt(10000);
	}
	
	// blok inicjuj�cy obiekt�w
	{
		id = nextId;
		nextId++;
	}
	
	// tzy konstruktory przeci��one
	public Employee(String n, double s) {
		name = n;
		salary = s;
	}
	public Employee(double s) {
		// wywo�anie konstruktora Employee(String, double)
		this("Employe #" + nextId, s);
	}
	
	// konstruktor domy�lny
	public Employee() {
		// name = "";
		// salary (niejawnie) = 0;
		// id -- w bloku inicjuj�cym
	}
	
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public int getId() {
		return id;
	}
}