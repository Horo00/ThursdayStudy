package december24;

import java.time.LocalDate;

public class Q12 {
	public static void main(String[] args) {
		LocalDate christmasIb = LocalDate.of(2020,12,24);
		christmasIb.plusDays(7);
		System.out.println(christmasIb);
	}
}
