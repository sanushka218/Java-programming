package dateNtimeApi;
import java.time.*;
public class timePrac {

	public static void main(String[] args) {
		ZonedDateTime zdt= ZonedDateTime.now();
		System.out.println(zdt);
		//OffsetDateTime odt=OffsetDateTime.now();
		//System.out.println(odt);
		//ZonedDateTime zdt2= ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
		//System.out.println(zdt2);
        Period p=Period.of(0,0,1);
        System.out.println(p.addTo(LocalDate.now()));
        Instant i=Instant.now();
        System.out.println(i);
	}

}
