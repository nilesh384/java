// import java.sql.Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;


class Date_Time{
    public static void main(String[] args) {

        // System.out.println(Long.MAX_VALUE);
        // Long l = System.currentTimeMillis();               //miliseconds or seconds or hours or minutes or days or months or year

        // System.out.println(l+" seconds");

        // Date d = new Date(System.currentTimeMillis());     // Date
        // System.out.println(d);

        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTime());                          //date and time

        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

        GregorianCalendar g = new GregorianCalendar();
        System.out.println(g.isLeapYear(2024));
        
        //most advanced 

        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        
        //date time formatter
        
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/dd/MM HH:mm:ss");
        System.out.println(dtf.format(dt));
    }
}

