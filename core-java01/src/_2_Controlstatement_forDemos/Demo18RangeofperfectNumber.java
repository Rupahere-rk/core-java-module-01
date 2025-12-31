package _2_Controlstatement_forDemos;

public class Demo18RangeofperfectNumber {
    public static void main(String[] args) {
        for(int number =1; number<=10000; number++){


            //check if the numberb is perfect or not
            int sumoffactors =0;
            for(int i =1; i<=number/2; i++){
                if(number % i ==0){
                    sumoffactors=sumoffactors+i;
                }
            }
            if(sumoffactors ==number){
                System.out.println("perfect number =" + number);
            }
        }
    }
}
