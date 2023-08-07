package DateTimeAPIDemo;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class JDTAPIDemo2 {
    public static void main(String[] args) {

        differenceData();
        
    }

    public static void differenceData(){
        ZoneId zone1 = ZoneId.of("Europe/Berlin");
        ZoneId zone2 = ZoneId.of("Asia/Kolkata");

        System.out.println(zone1.getRules());
        System.out.println(zone2.getRules());


        LocalTime zone1Time = LocalTime.now(zone1);
        System.out.println("Time at "+ zone1 + " " + zone1Time);

        LocalTime zone2Time = LocalTime.now(zone2);
        System.out.println("Time at "+ zone2 + " " + zone2);

        System.out.println("Hours difference betweeen " + zone1 + " and " + zone2 +" is "+ ChronoUnit.HOURS.between(zone1Time, zone2Time));
        System.out.println("Minutes difference betweeen " + zone1 + " and " + zone2 +" is " + ChronoUnit.MINUTES.between(zone1Time, zone2Time));

    }
}
