import java.util.*;

class Ex3_2 {
    
    class Hero {
        private String name;

        public Hero(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public static void main(String[] args) {
            Hero h1 = new Hero("saitou");
            Hero h2 = new Hero("suzuki");

            Map<Hero, Integer> heroes = new HashMap<>();
            
            heroes.put(h1, 3);
            heroes.put(h2, 7);
            
            for (Hero key : heroes.keySet()) {
                int value = heroes.get(key);
                System.out.println();
            }
            
        }
    }
}