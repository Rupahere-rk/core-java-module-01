package _2_Controlstatement_if_Demos;

public class Demo9 {
    public static void main(String[] args) {
        // check if the character is alphabet or digit
        char ch = 'z';
        if(( ch >='A' && ch<='z' ) || ch >='a'  & ch <='z'){
            System.out.println(ch+" is an alphabet");
        }
        if( ch >='0' && ch <='9'){
            System.out.println(ch+" is a digit");
        }
    }
}


