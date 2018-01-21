import com.gorzka.core.*;
// w powy�szym pakiecie znajduje si� definicja klasy Employee

import static java.lang.System.*;

/**
 * Demnstracja u�ycia pakiet�w
 * @author dagor
 *
 */

public class PackageTest {

	public static void main(String[] args) {
		// TDzi�ki instrukcji import nie ma konieczno�ci stosowania pe�nej nazwy
		// com.gorzka.core.Employee
		Employee harry = new Employee("Hubert Kowalski", 50000, 1989, 10, 1);
		
		harry.raiseSalary(5);
		
		// dzi�ki import static nie ma konieczno�ci pisa� System.out
		out.println("name = "+harry.getName()+", salary = "+harry.getSalary());

	}

}
