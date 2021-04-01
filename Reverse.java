package Working;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        System.out.println(reverse());
    }
    public static String reverse (){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a word =");
        String back="";
        String str="";
        str=scan.nextLine();
        for(int i=str.length(); i>0;i--){
                 back=back + str.substring(i-1,i);
        }
        return back;
    }
}
