package ex3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int code;
        String manager="";
        String event="";
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the event code 1 or 2");
        code = in.nextInt();

        if(code ==1){
            manager = "C. Larman";
            event = "Private Events";
        }else if(code ==2){
            manager = "Ken Bass";
            event = "Corporate Events";
        }else{
            System.out.println("Not a valid code");
        }
        System.out.println("Event Type: "+event);
        System.out.println("Event Manager: "+manager);
    }
}
