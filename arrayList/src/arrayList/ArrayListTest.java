package arrayList;

import java.util.*;

/**
 * U�ycie klasy ArrayList
 * @author dagor
 *
 */

public class ArrayListTest {

	public static void main(String[] args) {
		// Wstawienie do listy staff trzech obiekt�w klasy Employee
		ArrayList<Employee> staff = new ArrayList<>();
		
		staff.add(new Employee("Jan Brzechwa", 75000, 1949, 12, 2));
		staff.add(new Employee("Michail Veronikov", 65987, 1987, 11, 18));
		staff.add(new Employee("Igor Kowalski", 78945, 1996, 10, 6));
		
		// Zwi�kszenie pensji o 5%
		for (Employee e : staff) {
			e.raiseSalary(5);
		}
		
		// wy�wietlenie informacji o pracownikach
		for (Employee e : staff) {
			System.out.println("name="+e.getName()+", salary="+e.getSalary()+" hireDay="+e.getHireDay());
		}
	}

}
