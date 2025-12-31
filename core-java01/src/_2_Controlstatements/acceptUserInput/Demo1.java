package _2_Controlstatements.acceptUserInput;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Byte value");
        byte bytevalue = scanner.nextByte();

        System.out.println("Enter a short value");
        short shortvalue = scanner.nextShort();

        System.out.println("Enter a int value");
        int intvalue = scanner.nextInt();

        System.out.println("Enter a long value");
        long longvalue = scanner.nextLong();

        System.out.println("Enter a float value");
        float floatvalue = scanner.nextFloat();

        System.out.println("Enter a double value");
        double doublevalue = scanner.nextDouble();

        System.out.println("Enter a boolean value");
        boolean booleanvalue = scanner.nextBoolean();

        System.out.println("Enter a character");
        char charactervalue = scanner.next().charAt(0);

        System.out.println("Enter a word");
        String word = scanner.next();

        System.out.println("Enter a String line");
        String line = scanner.nextLine();

        System.out.println("printing all values");
        System.out.println("byte value =" + bytevalue);
        System.out.println("short value =" + shortvalue);
        System.out.println("int value =" + intvalue);
        System.out.println("long value =" + longvalue);
        System.out.println("float value =" + floatvalue);
        System.out.println("double value =" + doublevalue);
        System.out.println("boolean value =" + booleanvalue);
        System.out.println("char value =" + charactervalue);
        System.out.println("word value=" + word);
        System.out.println("string line value =" + line);











    }
}
