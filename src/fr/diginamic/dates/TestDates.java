package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestDates {
	
	public static void main(String args[]) {
		
		SimpleDateFormat formatDuJour = new SimpleDateFormat ("dd/MM/yyyy", Locale.FRANCE);
		SimpleDateFormat formatDate1 = new SimpleDateFormat ("yyyy/MM/dd HH:mm:ss", Locale.FRANCE);
		
		LocalDate dateDuJour = LocalDate.now();
		
		Calendar calendrier = Calendar.getInstance();
		calendrier.set(2016, 4, 19, 23, 59, 30);
		Date date1 = calendrier.getTime();
		
		LocalDateTime dateSysteme = LocalDateTime.now();
		
		
		System.out.println(formatDate1.format(dateSysteme));
	}

}
