package enums;

import java.util.*;

/**
 * typy wyliczeniowe
 * @author dagor
 *
 */

public class EnumTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Podaj rozmiar: (SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
		String input = in.next().toUpperCase();
		Size size = Enum.valueOf(Size.class, input);
		System.out.println("rozmiar=" + size);
		System.out.println("skrót=" + size.getAbbreviation());
		if (size == Size.EXTRA_LARGE)
			System.out.println("Wielkolud :D !");
	}
}

enum Size {
	SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
	
	private Size(String abbreviation) { 
		this.abbreviation = abbreviation; 
	}
	public String getAbbreviation() {
		return abbreviation;
	}
	
	private String abbreviation;
}
