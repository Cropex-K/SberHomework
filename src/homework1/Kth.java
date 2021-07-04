package homework1;

import java.util.Scanner;

public class Kth {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        long k = in.nextLong();

        long des = 1;
        long ed = 9;

        while (k>=ed*des){
            k -=ed*des;
            des++;
            ed*=10;
        }

        long number =1;
        for (int i=1; i<=des-1;i++){
            number *= 10;
        }
        number+=k/des;

        long position =  (des - (k%des));
        long result=0;

        while (number>0&&position>0){
            result = number%10;
            number/=10;
            position--;

        }
        System.out.println(result);
    }
}

