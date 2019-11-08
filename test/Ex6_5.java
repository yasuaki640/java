import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

interface Func1 {
    boolean call(int x);
}

interface Func2 {
    String call(boolean male, String name);
}

public class Ex6_5 {
    public static void main(String[] args) {
        FuncList funclist = new FuncList();
        Func1 f1 = funclist::isOdd;
        Func2 f2 = funclist::addNamePrefix;
        System.out.println(f1.call(15));
        System.out.println(f2.call(true, "Smith"));

    }
}