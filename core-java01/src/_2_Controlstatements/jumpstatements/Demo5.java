package _2_Controlstatements.jumpstatements;

public class Demo5 {
    public static void main(String[] args) {
        for( int i =1;i<=10; i++) {
            if (i == 5) {
                return;
            }
            System.out.println(i);
        }
        System.out.println("rest of the main");
    } //output -End of the loop and end of Method 1,2,3,4
}
