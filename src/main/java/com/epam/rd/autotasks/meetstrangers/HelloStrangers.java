package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        int count = scanner.nextInt();
        String name;
        if(count == 0){       System.out.println("Oh, it looks like there is no one here");}
        else if (count < 0) { System.out.println("Seriously? Why so negative?");
        } else {
            for(int i = 1; i <= count; i++) {
                name = scanner2.nextLine();
                System.out.println("Hello, " + name);
            }
        }
    }
}
