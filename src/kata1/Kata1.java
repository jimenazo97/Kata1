package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1997, 7, 17);  
        Person rafaelo = new Person ("Rafaelo", date);
        System.out.println(rafaelo.getName() + " tiene " + rafaelo.getAge() + " años");
    }
    
}
