package _2_Controlstatement_while_Demos;

public class Demo13 {
    public static void main(String[] args)
    { //reverse
        int number =123;
        int result =0;
        int digit ;

        while (number > 0){
            digit =number % 10;
            result =result* 10 +digit;
            number =number/10;
        }

        System.out.println("result of digits =" + result);

    }

}


