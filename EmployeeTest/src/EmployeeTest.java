
public class EmployeeTest {

	public static void main(String[] args) {
		// wstawienie trzech obiektów pracowników do tablicy staff:
		Employee[] staff = new Employee[3];
		
		staff[0] = new Employee("Daniel Gorzka", 7500, 2010, 06, 20);
		staff[1] = new Employee("Marek Mielnik", 6000, 2012, 12, 21);
		staff[2] = new Employee("Rados³aw Nakielski", 4500, 2013, 11, 14);
		
		//zwiêkszenie pensji wszystkich pracowników o 5%
		for (Employee e : staff) {
			e.raiseSalary(5);
		}
		
		//drukowanie informacji o wszystkich obiektach klasy Employee
		for (Employee e : staff) {
			System.out.println("Imiê i nazwisko: " + e.getName() + ", pensja: " 
					+ e.getSalary() + ", dzieñ zatrudnienia: " + e.getHireDay());
		}

	}

}
