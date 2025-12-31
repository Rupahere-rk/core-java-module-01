package _2_Controlstatement_if_Demos;

public class Demo1 {
    public static void main(String[] args) {
        if (true){
            System.out.println("A");
            System.out.println("B");
        }
        // if() {} //CTE -- condition must specified
        //if (1) {} //CTE -- Condition must be boolean type
        if (1 < 2) {
            System.out.println("C");
            System.out.println("D");//8
        }
        boolean isExecute = true;
        if (isExecute) {
            System.out.println("E");
            System.out.println("F");
        }
    }
}

