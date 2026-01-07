package _1_Introduction_3_ClassComponents;

public class Demo1 {
    public static void main(String[] args) {
        int number; //local variable -declaration
        // System.out.println((num));//CTE :value must be provided
        number = 100;//initialization
        System.out.println(number);//access it directly
    display();
    }
    public static void display(){
       //System.out.println(number)://CTE :as number is defined in another method
       int number =200;
       System.out.println(number);
    }

}
