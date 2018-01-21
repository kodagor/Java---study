package abstractClasses;

public class PersonTest {

	public static void main(String[] args) {
		Person[] people = new Person[2];
		
		// Wstawienie do tablicy people obiekt�w Student i Employee
		people[0] = new Employee("Henryk Kwiatek", 50000, 1989, 10, 1);
		people[1] = new Student("Daniel Gorzka", "informatyka");
		
		// Wy�wietlenie imion i nazwisk oraz opis�w wszystkich obiekt�w klasy Person
		for(Person person : people) {
			System.out.println(person.getName() + ", " + person.getDescription());
		}

	}

}
