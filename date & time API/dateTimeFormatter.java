package dateNtimeApi;
import java.util.*;
import java.time.*;
import java.time.LocalDateTime;
import java.time.format.*;
public class dateTimeFormatter {

	public static void main(String[] args) {

		LocalDateTime ldt= LocalDateTime.now();
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm::ss");
		System.out.println(dtf.format(ldt));
		
		ZonedDateTime lzt= ZonedDateTime.now();
		DateTimeFormatter dztf=DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm::ss z Z");
		System.out.println(dztf.format(lzt));

	}

}
