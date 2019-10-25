import java.util.*;
 M
class Hero {
    public String name;
}

class List4_3 {
    public static void main(String[] args) {
        List<Hero> list = new ArrayList<Hero>();

        Hero h1 = new Hero();
        h1.name = "ミナト";
        list.add(h1);
        System.out.println("要素数=" + list.size());
        h1 = new Hero();
        h1.name = "ミナト";
        list.remove(h1);
        System.out.println("要素数=" + list.size());

    }
}
