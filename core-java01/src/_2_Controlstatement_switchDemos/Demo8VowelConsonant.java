package _2_Controlstatement_switchDemos;

import java.util.Scanner;

public class Demo8VowelConsonant {
    public static void main(String[] args) {
        //check if the character is vowel and Cosonant
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch =scanner.next().charAt(0);

        //vowel-a,e,i,o,u
        //Consonants-rest
        /*if(ch=='a' || ch=='e'|| ch=='i'|| ch=='u'){
            System.out.println("vowel");
        } else{
            System.out.println("Consonants");
        }*/

        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowel");break;
            default:
                System.out.println("Consonants");break;

        }


    }
}
