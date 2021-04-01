package Working;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("enter number");
            Scanner scan = new Scanner(System.in);
            sum = sum + scan.nextInt();
            System.out.println("total number= "+ sum);
            if(sum==100){
                System.out.println("bravo congura....");
            }

            if (sum > 100) {
                System.out.println("overloading" + " total =" + sum);
              System.out.println("game over");
              i=10;
            }

    }
    }
}