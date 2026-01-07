package _2_Controlstatement_while_Demos;

public class Demo12Reverse {
    public static void main(String[] args) {
        // find the sum of digit of the given number
        int number = 1234;
        int result = 0;
        int digit;
        while(number > 0){
            digit = number % 10; //1%10->digit =1
            result =result *10 +digit;
            number = number / 10;//1/10-->number =0


            System.out.println("reverse  of digits =" + result);
        }

    }

}


