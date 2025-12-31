package _1_Operator_6_logical;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println(
                (10 % 2== 0 )&&(10 % 5== 0)
        );//True
        System.out.println(
                (10 % 2== 1 )&&(10 % 0== 5) //false
        );
        System.out.println(
                (10 % 2== 0)||(10 % 0== 5) //true
        );
        System.out.println(
                (10 % 2== 5)&&(10 % 2== 1) // AirthmeticException :/by Zero
        );


    }
}

