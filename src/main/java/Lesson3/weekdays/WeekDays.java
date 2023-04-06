package Lesson3.weekdays;

import java.util.Arrays;

public enum WeekDays {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
public boolean isWorkDay ()
{
    return true; // если пн-пт
}
public boolean isWeekEnd (){
    return true ; // если сб-вс
    }

    public static void main(String[] args) {
        System.out.println(MONDAY);
        System.out.println(SUNDAY.ordinal());
        System.out.println( Arrays.toString(WeekDays.values()));
        WeekDays day = WeekDays.FRIDAY;
        day = WeekDays.valueOf("WEDNESDAY");
       // day = WeekDays.valueOf("HELLO"); вызовет Эксцепшн
        System.out.println(day);
    }
}
