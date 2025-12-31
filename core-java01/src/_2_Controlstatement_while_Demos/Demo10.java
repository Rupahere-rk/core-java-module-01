package _2_Controlstatement_while_Demos;

public class Demo10 {
    public static void main(String[] args) {
        //find the sum of digits of the given number
        int number = 123;
        int sum = 0;

        int digit = number % 10; //digit =3
        sum = sum + digit;//sum =3

        number = number / 10; // number =12
        digit = number % 10;//digit=2
        sum = sum + digit; //sum =5

        number = number / 1; //number=1
        digit = number % 10; //digit =1
        sum = sum + digit; //sum =6

        number = number / 1; // number =0 --> stops
    }
}

