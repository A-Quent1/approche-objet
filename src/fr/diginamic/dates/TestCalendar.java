package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TestCalendar {
	
	public static void main(String args[]) {
		
		SimpleDateFormat formatDate1 = new SimpleDateFormat ("dd/MM/yyyy", Locale.FRANCE);
		SimpleDateFormat formatCal = new SimpleDateFormat ("yyyy/MM/dd HH:mm:ss", Locale.FRANCE);
		
		SimpleDateFormat formatFrance = new SimpleDateFormat ("EEEE MMMM yyyy HH:mm:ss", Locale.FRANCE);
		SimpleDateFormat formatRussie = new SimpleDateFormat ("EEEE MMMM yyyy HH:mm:ss", new Locale("ru","RU"));
		SimpleDateFormat formatChine = new SimpleDateFormat ("EEEE MMMM yyyy HH:mm:ss", Locale.CHINA);

		Calendar calendrier = Calendar.getInstance();
		calendrier.set(2016, 4, 19, 23, 59, 30);
		Date date1 = calendrier.getTime();
		
		LocalDateTime localDateTime = LocalDateTime.now();
		Calendar cal = Calendar.getInstance();
		cal.set(localDateTime.getYear(), localDateTime.getMonthValue()-1, localDateTime.getDayOfMonth(), localDateTime.getHour(), localDateTime.getMinute(), localDateTime.getSecond());
		Date date2 = cal.getTime();
		
		System.out.println(formatCal.format(date2));
		
		System.out.println(formatFrance.format(date2));
		System.out.println(formatRussie.format(date2));
		System.out.println(formatChine.format(date2));
	}

}
