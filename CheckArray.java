package Working;

import java.util.List;
import java.util.Scanner;

public class CheckArray {

    public static void main(String[] args) {
        int[]myList= {3,5,21,32,34,45,56,57,76,87,95};
        int a=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter number ");
        int number =scan.nextInt();
        for(int i=0;i<11;i++){
                 a=myList[i];
                if(a==number){
                    System.out.println("The number you entered is in the Array");
                    i=11;
                }

                }if(a!=number){
            System.out.println("The number you entered is not in the Array");
        }


        }

    }

