import java.util.Date;
import java.text.SimpleDateFormat;

class List14_4 {
    public static void main(String[] args) throws Exception {
        Date now = new Date();
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String s = f.format(now);
        System.out.println(s);
        
        Date d = f.parse("2011/09/22 01:23:45");
        System.out.println(d);
    }
}