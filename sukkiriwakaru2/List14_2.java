import java.util.Date;
import java.time.*;

class List14_2 {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        System.out.println(now.getTime());
        Date past = new Date(1316622225935L);
        System.out.println(past);
    }
}