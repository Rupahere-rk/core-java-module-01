package _2_Controlstatement_forDemos;

public class Demo14FactorsSum {
    public static void main(String[] args) {

        //factors sum
        int number = 28;
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println("factor =" + i);
                sum = sum + i;
            }
            System.out.println("sum of Factors =" + sum);
            //perfect number {sum of factors = given number}
            //e.g 6 [1+2+3=6],28{1+2+4+7+!4=28}
            System.out.println(sum ==number ? "its perfect " : "not a perfect");

        }
    }
}
