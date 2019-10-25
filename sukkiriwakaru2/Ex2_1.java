import java.util.*;
import java.text.*;

class Ex2_1 {
    public static void main(String[] args) {
        Date now = new Date();
        Calendar c = Calendar.getInstance();
        
        c.setTime(now);
        
        int day = c.get(Calendar.DAY_OF_MONTH);
        
        day += 100;
        c.set(Calendar.DAY_OF_MONTH, day);
        
        Date future = c.getTime();
        
        SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
        System.out.println(f.format(future));
    }
}