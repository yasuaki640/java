import java.util.function.IntBinaryOperator;

public class List6_4 {
    public static void main(String[] args) {
        // 二つの引数の差を求める処理の実態を生み出し、代入する
        IntBinaryOperator func = (int a, int b) -> {
            return a - b;
        };
        int a = func.applyAsInt(5, 3);
        System.out.println("5-3は" + a);
    }
}