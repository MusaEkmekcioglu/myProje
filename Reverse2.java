package Working;

import javafx.beans.binding.When;

import java.util.Scanner;

public class Reverse2 {

    public static void main(String[] args) {
        System.out.println(reverse());

    }
    public static String reverse(){
        String name="ortizSenderoz";
        StringBuilder str = new StringBuilder(name);


//        for (int i=back.length();i>0;i--){
//            back =back+str.charAt(i);
//        }
        return str.reverse().toString();
    }
}
