package _2_controlstatments_dowhileDemos;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        int left =0;
        while(left < 10){
            System.out.println("Enter the choice");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            do{
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3.Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exit");
                switch (choice){
                    case 1-> System.out.println("Addition");
                    case 2->System.out.println("Substraction");
                    case 3-> System.out.println("Multiplication");
                    case 4-> System.out.println("Division");
                }
                System.out.println("Enter the choice");
                 choice = scanner.nextInt();
            } while(choice !=5);
        }
    }
}
