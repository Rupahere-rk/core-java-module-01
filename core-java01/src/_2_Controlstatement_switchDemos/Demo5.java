package _2_Controlstatement_switchDemos;

public class Demo5 {
    public static void main(String[] args) {
        int value = 5;

        switch (value) {
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            case 5 -> System.out.println("Five");
            case 6 -> System.out.println("Six");
            case 7 -> System.out.println("Seven");
            case 8 -> System.out.println("Eight");
            case 9 -> System.out.println("Nine");
            default -> System.out.println("invalid input");

        }
    }
}