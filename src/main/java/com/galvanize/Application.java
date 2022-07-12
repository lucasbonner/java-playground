package com.galvanize;

public class Application {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("You must pass two arguments.");
            System.exit(1);
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println(a + b);
    }

}
