package com.galvanize;

public class Application {

    public static void main(String[] args) {
        if (args.length == 1) {
            System.out.println(String.format("Please specify an email for %s", args[0]));
            System.exit(1);
        } else if (args.length != 2) {
            System.out.println("Please specify a name and email");
            System.exit(1);
        }

        System.out.println(args[0] + String.format(" <%s>", args[1]));
//        System.out.println(String.format("<%s>", args[1]));
    }

}
