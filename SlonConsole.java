package org.example;

import java.util.Scanner;

public class SlonConsole {
    private SlonLogic outIn;
    private Scanner sc;

    public SlonConsole(){
        sc = new Scanner(System.in);
        outIn = new SlonLogic();
    }

    public void output(){
        System.out.println(outIn.start());
        while (outIn.bool() == true){
            String s = sc.nextLine();
            System.out.println(outIn.ifelse(s));
        }
    }
}
