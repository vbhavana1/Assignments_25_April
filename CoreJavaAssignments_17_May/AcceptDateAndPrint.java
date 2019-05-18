import java.util.Date;
import java.time.*;
import java.util.*; 

class AcceptDateAndPrint{
	public static void main(String[] args) {
		
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the Date");
		String str = sc.nextLine();
		// Date dt = new Date(str);
		//newdate = Date.parse(str);
		// String dateToStr = DateFormat.getInstance().format(dt);
		LocalDate newdate = LocalDate.parse(str);
		LocalDate currentdate = LocalDate.now();
		Period difference = Period.between(newdate, currentdate);
		System.out.println(difference.getYears());

	}
}