package _2_Controlstatement_while_Demos;

public class Demo13Palindrome {
    public static void main(String[] args) {

        int number =456;
        int originalnumber=number;
        int reverse =0;
        int digit;

       while(number>0){
           digit =number %10;
           reverse = reverse*10+digit;
           number = number /10;
       }
       System.out.println("reverse ="+reverse);
       System.out.println(reverse ==originalnumber ? "palindrom": "not a palindrome");
    }
}
