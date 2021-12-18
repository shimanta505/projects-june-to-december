package collections;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class DateAndTime {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        String currentDate = dateFormat.format(date);
        System.out.println(currentDate);

        LocalTime time = LocalTime.now();

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh/mm/ss");

        String formatTime = time.format(timeFormatter);

        System.out.println(formatTime);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        int dd = localDate.getDayOfMonth();
        int mm = localDate.getMonthValue();
        int yyyy = localDate.getYear();

        System.out.printf("%d-%d-%d",dd,mm,yyyy);
    }
    public static void time(List<Integer> list){
        long start =System.currentTimeMillis();

        for (int i=0;i<=100000;i++){
            list.add(0,i);
        }
        long end = System.currentTimeMillis();
        System.out.println(list.getClass().getName()+" "+(end-start));
    }

}
