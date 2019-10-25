import java.util.*;

class Hero {
    public String name;
}

public class List3_9 {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "みなと";
        
        List<Hero> list = new ArrayList<Hero>();
        list.add(h);
        h.name = "すがわら";
        System.out.println(list.get(0).name);
    }
}