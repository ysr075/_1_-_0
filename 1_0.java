package com.company;

import java.util.Scanner;

public class input {
    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nWelcome to my 1 and 0 project.\n");
        System.out.print("\n_~~~~~~~~~~~~~~ATTENTION~~~~~~~~~~~~~~_\n|  NUMBERS ARE ONLY EQUAL TO 1 OR 0!  |\n-~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~-\n");
        String answer_yn;
        System.out.print("\ncontinue?: ");
        answer_yn = input.nextLine();
        if (answer_yn.equals("y") || answer_yn.equals("yes")) {
            int i;
            int loops;
            System.out.print("\nloops: ");
            loops = input.nextInt();
            if (loops < 0) {
                System.out.print("\nSince when can you loop something below zero, :D\nexiting...\n");
                System.exit(1);
            } else if (loops == 0) {
                System.out.print("\nSince when can you loop something zero times, :D\nexiting...\n");
                System.exit(1);
            }
            int num1;
            System.out.print("\nnum1: ");
            num1 = input.nextInt();
            if (num1 > 1) {
                System.out.print("\nnumber can't be higher than 1!\n");
                System.exit(1);
            } else if (num1 < 0) {
                System.out.print("\nnumber can't be lower than 0!\n");
                System.exit(1);
            }
            int num2;
            System.out.print("\nnum2: ");
            num2 = input.nextInt();
            if (num2 > 1) {
                System.out.print("\nnumber can't be higher than 1!\n");
                System.exit(1);
            } else if (num2 < 0) {
                System.out.print("\nnumber can't be lower than 0!\n");
                System.exit(1);
            }
            int num3;
            System.out.print("\nnum3: ");
            num3 = input.nextInt();
            if (num3 > 1) {
                System.out.print("\nnumber can't be higher than 1!\n");
                System.exit(1);
            } else if (num3 < 0) {
                System.out.print("\nnumber can't be lower than 0!\n");
                System.exit(1);
            }
            for (i = 0; i < loops; i++) {
                System.out.print("\n[ " + num1 + ", " + num2 + ", " + num3 + " ]\n");
            }
        } else {
            System.exit(1);
        }
    }
}
