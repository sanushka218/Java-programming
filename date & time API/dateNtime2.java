package dateNtimeApi;
import java.util.*;
import java.time.*;
public class dateNtime2 {

	public static void main(String[] args) {

		Date d=new Date();
		System.out.println(d);
		//LocalDate ld=LocalDate.now();
		//LocalDate ld=LocalDate.now(Clock.systemDefaultZone());
		//LocalDate ld=LocalDate.now(ZoneId.of("Asia/Kolkata"));
		//LocalDate ld=LocalDate.ofEpochDay(0);
		LocalDate ld=LocalDate.parse("2020-01-03");
		LocalDate ldd=ld.plusDays(99);
		System.out.println(ldd);
		
		LocalTime lt= LocalTime.now();
		System.out.println(lt);

		}

}
