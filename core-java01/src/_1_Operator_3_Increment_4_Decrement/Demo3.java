package _1_Operator_3_Increment_4_Decrement;

public class Demo3 {
    public static void main(String[] args) {
        int a =1;
        int b=2;
        int c=3;
        System.out.println(++a + ++b + --a + b++ - c-- - --b);
        // 2 + 3 + 1+ 3-3-3
        System.out.println(a); //1
        System.out.println(b); //3
        System.out.println(c); //2

    }
}



