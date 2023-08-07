package DateTimeAPIDemo;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class JDTAPIDemo1 {
    
    public static void main(String[] args) {
        Clock myClock = Clock.systemDefaultZone();

        long millsec = myClock.millis();
        System.out.println(millsec);

        LocalDateTime currTime = LocalDateTime.now();
        System.out.println(currTime);

        LocalDate currDate = currTime.toLocalDate();
        System.out.println(currDate);

        System.out.println("CURRENT DATE AND TIME");
        System.out.println("Year: "+currTime.getYear());
        System.out.println("Month: "+currTime.getMonth());
        System.out.println("Day: "+currTime.getDayOfMonth());
        System.out.println("Hour: "+currTime.getHour());
        System.out.println("Minute: "+currTime.getMinute());
        System.out.println("Second: "+currTime.getSecond());
        
    }
}
