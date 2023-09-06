package Class10;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class LocalDateTimeConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate today = LocalDate.now();
		System.out.println("Current system Date is " + today);
		
		LocalDate indiaDate = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current India Date is " + indiaDate);
		
		LocalDate usDate = LocalDate.now(ZoneId.of("US/Central"));
		System.out.println("Current US Date is " + usDate);
		
		LocalDate firstDay2023 = LocalDate.of(2023, Month.JANUARY, 1);
		System.out.println("First Day of 2023 is " + firstDay2023);
		
		//Now Date time exception will come
        //LocalDate feb29_2023 = LocalDate.of(2023, Month.FEBRUARY, 29);
        //System.out.println("Ferbruary last  Day of 2023 is " + feb29_2023);
		
		LocalDate epochDay2023 = LocalDate.ofEpochDay(1000);
		System.out.println("1000 Day from Epoch Date is " + epochDay2023);
		
		LocalDate hundreth_Day_Of_2020 = LocalDate.ofYearDay(2020,100);
		System.out.println("100th Day from Epoch Date is " + hundreth_Day_Of_2020);
	}

}
