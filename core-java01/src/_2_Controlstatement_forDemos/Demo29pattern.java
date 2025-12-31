package _2_Controlstatement_forDemos;

public class Demo29pattern {
    public static void main(String[] args) {
        for (int row = 1; row <=5; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col % 2== 1 ? "1":"0");
            }
            System.out.println();
        }

    }
}


