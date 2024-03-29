import java.time.LocalDate;
import java.time.Month;

public class Time1 {

	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis()/1000/3600/24/365);
		LocalDate d= LocalDate.now();
		System.out.println(d);
		LocalDate a= LocalDate.of(1990,Month.AUGUST,17);
		System.out.println(a);
		System.out.println(d.plusDays(1));
		System.out.println(d.minusMonths(1));
		System.out.println(d.isLeapYear());
		System.out.println(d.withDayOfMonth(20));
		System.out.println(d.lengthOfMonth());
	}

}
