import javax.swing.*;

public class DayOfYear{
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public DayOfYear(){
        this(0,0,0);
    }

    public DayOfYear(int day, int month, int year){
        setDay(day);
        setMonth(month);
        setYear(year);
    }

}
