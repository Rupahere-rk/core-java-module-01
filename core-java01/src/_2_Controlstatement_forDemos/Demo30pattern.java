package _2_Controlstatement_forDemos;

public class Demo30pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print("x");
        }
        System.out.println();
        System.out.println("using nested for loop");

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= 50; j++) {
                System.out.println("x");
            }
            System.out.println();
        }
    }
}

