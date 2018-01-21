/**
 * Demonstracja metod statycznych
 * @author dagor
 *
 */
public class StaticTest {

	public static void main(String[] args) {
		// Wstawienie do tablicy staff trzech obiektów reprezentuj¹cych pracowników
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Tomasz", 40000);
		staff[1] = new Employee("Dariusz", 60000);
		staff[2] = new Employee("Grzegorz", 50000);
		
		// Drukowanie informacji o wszystkich obiektach klasy Employee
		for (Employee e : staff) {
			e.setId();
			System.out.println("Id: "+e.getId()+", name: "+e.getName()+", salary: "+e.getSalary());
		}
		
		// wywo³anie metody statycznej:
		int n = Employee.getNextId();
		System.out.println("Nastêpny dostêpny identyfikator: " + n);
	}

}

class Employee {
	private static int nextId = 1;
	
	private String name;
	private double salary;
	private int id;
	
	public Employee(String n, double s) {
		name = n;
		salary = s;
		id = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public Double getSalary() {
		return salary;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId() {
		// ustawienie identyfikatora na kolejny nastêpny numer
		id = nextId;
		nextId++;
	}
	
	public static int getNextId() {
		// zwrócenie pola statycznego
		return nextId;
	}
	
	public static void main(String[] args) {
		// test jednostkowy
		Employee e = new Employee("Grzegorz", 50000);
		System.out.println(e.getName() + " " + e.getSalary());
	}
}
