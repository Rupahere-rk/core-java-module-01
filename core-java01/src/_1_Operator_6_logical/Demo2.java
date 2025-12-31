package _1_Operator_6_logical;

public class Demo2 {
    public static void main(String[] args) {
        int year =2024;
        /* what is leap year ?
        must  be divisable by 4 and it is a century then it must be divisible by 400
        e.g -2000,2024,2400,1600,1200

        not leap year 1900,2100,2025
         */

        System.out.println(
                (year %400 ==0)|| (year % 4 ==0 && year % 100 !=0));
    }
}




