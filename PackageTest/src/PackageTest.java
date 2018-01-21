import com.gorzka.core.*;
// w powy¿szym pakiecie znajduje siê definicja klasy Employee

import static java.lang.System.*;

/**
 * Demnstracja u¿ycia pakietów
 * @author dagor
 *
 */

public class PackageTest {

	public static void main(String[] args) {
		// TDziêki instrukcji import nie ma koniecznoœci stosowania pe³nej nazwy
		// com.gorzka.core.Employee
		Employee harry = new Employee("Hubert Kowalski", 50000, 1989, 10, 1);
		
		harry.raiseSalary(5);
		
		// dziêki import static nie ma koniecznoœci pisaæ System.out
		out.println("name = "+harry.getName()+", salary = "+harry.getSalary());

	}

}
