package _2_Controlstatement_forDemos;

public class Demo25pattern {
    public static void main(String[] args) {


        for (int row = 5; row >= 1; row--) {
            for (int col = 1; col <= row; col++) {
                System.out.print("x");
            }
            System.out.println();
        }

    }
}


