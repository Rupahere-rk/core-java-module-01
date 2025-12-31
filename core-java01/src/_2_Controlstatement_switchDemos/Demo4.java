package _2_Controlstatement_switchDemos;

public class Demo4 {
    public static void main(String[] args) {
        int digit = 1;
        //from java 12 :break is implicity added afyer each case statements
        switch(digit) {
            case 0:
                System.out.println("zero");
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
            case 4:
                System.out.println("four");break;
            case 5:
                System.out.println("five");
            case 6:
                System.out.println("six");
            case 7:
                System.out.println("seven");
            case 8:
                System.out.println("Eight");
            case 9:
                System.out.println("Nine");
            default:
                System.out.println("invalid input");
        }

    }
}


