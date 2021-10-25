package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args)
    {
        Mobile m = new Mobile();
        boolean quit = false;
        while(!quit)
        {
            System.out.println("Enter ");
            System.out.println(" 0 - quit");
            System.out.println("1 - print all");
            System.out.println("2 - add");
            System.out.println("3 - update");
            System.out.println("4 - remove");
            System.out.println("5 - search");
            int ch = s.nextInt();
            switch (ch) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    m.print();
                    break;
                case 2:
                    m.add();
                    break;
                case 3:
                    m.update();
                    break;
                case 4:
                    m.remove();
                    break;
                case 5:
                    m.search();
                    break;
            }
        }
        s.close();
    }
}
