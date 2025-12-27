package _1_Operator_Airthmetic_Shorthand;

public class Demo7 {
    public static void main(String[] args) {
        int number =123456789;
        int sumofDigits=0;
        int digit=0;

        while(number>0) {
            digit = number % 10;
            sumofDigits += digit;
            number /= 10;
        }

        digit =number % 10;
        //sum of digits = sumofdigit +Digit;
        sumofDigits += digit;
        //number =number/10;
        number /=10;

        digit =number % 10;
        //sum of digits = sumofDigits +Digit;
        sumofDigits += digit;
        //number =number/10;
        number /=10;

        digit =number % 10;
        //sum of digits = sumofDigits +Digit;
        sumofDigits += digit;
        //number =number/10;
        number /=10;

        digit =number % 10;
        //sum of digits = sumofDigits +Digit;
        sumofDigits += digit;
        //number =number/10;
        number /=10;

        digit =number % 10;
        //sum of digits = sumofDigitS +Digit;
        sumofDigits += digit;
        //number =number/10;
        number /=10;

        digit =number % 10;
        //sum of digits = sumofDigits +Digit;
        sumofDigits += digit;
        //number =number/10;
        number /=10;


        System.out.println("sum of digits: " + sumofDigits);
    }
}





