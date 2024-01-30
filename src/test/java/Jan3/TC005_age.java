package Jan3;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TC005_age {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date1=LocalDate.now();
		DateTimeFormatter formatter=new DateTimeFormatterBuilder().parseCaseInsensitive().append(DateTimeFormatter.ofPattern("yyyy-MMM-dd")).toFormatter();

		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter Your Date of Birth in dd/mm/yyyy");
		//String dateofbirth=sc.nextLine();
		String dateofbirth="2000-Dec-20";
		System.out.println("You entered:"+dateofbirth);
		System.out.println();
		DateTimeFormatter format;
		LocalDate d1=LocalDate.parse(dateofbirth,formatter);
		LocalDate d11=LocalDate.parse(dateofbirth,formatter);
		System.out.println(d11);
		
		Period p1=date1.until(d11);
		System.out.println();
		System.out.println("Days:"+p1.get(ChronoUnit.DAYS));
		System.out.println("Months:"+p1.get(ChronoUnit.MONTHS));
		System.out.println("Years:"+p1.get(ChronoUnit.YEARS));
		
		
	}

}
