import java.util.*;
import java.time.LocalDate;
import java.time.format.*;

class Ex2_2 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate future = now.plusDays(100);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
        System.out.println(future.format(f));
    }
}