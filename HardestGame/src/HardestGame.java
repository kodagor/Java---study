import java.util.Scanner;

public class HardestGame {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int comp_number;
		int my_number;
		
		System.out.println("Najtrudniejsza gra!!!");
		System.out.println("Podaj liczb� (btw, tylko naturalne): ");
		
		try {
			my_number = scan.nextInt();
			scan.close();
			
			comp_number = my_number + 1;
			
			if (my_number != comp_number) {
				
				if (my_number > comp_number) {
					System.out.println("Brawo, masz mnie. Moja liczba to: " + comp_number + "\nWygra�e� :(");
				} else if (my_number < comp_number) {
					System.out.println("Moja liczba to: " + comp_number + "\nPrzegra�e�!!!");
				}
			
			} else {
				System.out.println("Ohoho, my�limy podobnie");
			}
		} catch (Exception e) {
			System.out.println("�ojojojo, a� tak nie umiem liczy�, jestem tylko g�upi� maszyn�.");
		}
	}

}
