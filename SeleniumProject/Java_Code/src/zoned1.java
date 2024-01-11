import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class zoned1 {

	public static void main(String[] args) {
		ZonedDateTime d= ZonedDateTime.now();
		System.out.println(d);
		ZonedDateTime a= ZonedDateTime.now(ZoneId.of("Europe/Paris"));
		System.out.println(a);
		ZonedDateTime c= a.withZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println(c);
		//System.out.println(d.plusDays(1));
		//System.out.println(d.minusMonths(1));
		//System.out.println(d.isLeapYear());
		//System.out.println(d.withDayOfMonth(20));
		//System.out.println(d.lengthOfMonth());

	}

}
