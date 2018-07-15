import java.time.*;

/**
* LocalDate
* - Contains just a date, no time and no time zone.
* - A good example of LocalDate is your birthday this year.
*
* LocalTime
* - Contains just a time—no date and no time zone.
* - A good example of LocalTime is midnight. 
*
* LocalDateTime
* - Contains both a date and time but no time zone
* - A good example of LocalDateTime is "the stroke of midnight on New Year’s.""
*/
public class DateTimeTest{
	public static void main(String... args){
		System.out.println("AKISIISIS");
		
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		//Creating LocalDate
		LocalDate date1 = LocalDate.of(2015, Month.JANUARY, 20);
		LocalDate date2 = LocalDate.of(2015, 1, 20);
		
		//Creating LocalTime
		LocalTime time1 = LocalTime.of(6, 15); // hour and minute
		LocalTime time2 = LocalTime.of(6, 15, 30); // + seconds
		LocalTime time3 = LocalTime.of(6, 15, 30, 200); // + nanoseconds

		//Creating LocalDateTime
		LocalDateTime dateTime1 = LocalDateTime.of(2015, Month.JANUARY, 20, 6, 15, 30);
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
		
		//You are not allowed to construct a date or time object directly.
		//LocalDate d = new LocalDate(); // DOES NOT COMPILE
		//LocalDate.of(2015, Month.JANUARY, 32) // throws DateTimeException
		
		/**
		* MENIPULATION
		*/
		//Plus
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println(date); // 2014-01-20
		
		date = date.plusDays(2);
		System.out.println(date); // 2014-01-22
		
		date = date.plusWeeks(1);
		System.out.println(date); // 2014-01-29
		
		date = date.plusMonths(1);
		System.out.println(date); // 2014-02-28
		
		date = date.plusYears(5);
		System.out.println(date); // 2019-02-28
		
		//Minus
		LocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time = LocalTime.of(5, 15);
		LocalDateTime dateTime = LocalDateTime.of(date3, time);
		System.out.println(dateTime); // 2020-01-20T05:15
		
		dateTime = dateTime.minusDays(1);
		System.out.println(dateTime); // 2020-01-19T05:15
		
		dateTime = dateTime.minusHours(10);
		System.out.println(dateTime); // 2020-01-18T19:15
		
		dateTime = dateTime.minusSeconds(30);
		System.out.println(dateTime); // 2020-01-18T19:14:30
		
		//Chaining
		LocalDate date4 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time4 = LocalTime.of(5, 15);
		LocalDateTime dateTime4 = LocalDateTime.of(date4, time4)
			.minusDays(1).minusHours(10).minusSeconds(30);
		System.out.println(dateTime4);
		
		//Trick
		LocalDate date5 = LocalDate.of(2020, Month.JANUARY, 20);
		date5 = date.plusMinutes(1); // DOES NOT COMPILE
	}
}