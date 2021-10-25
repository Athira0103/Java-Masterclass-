package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;
public class Mobile {
    private static contacts c = new contacts();
    private static Scanner s = new Scanner(System.in);
        public static void print()
        {

            for(int i=0;i<c.getNames().size();i++)
            {
                String name = c.getNames().get(i);
                long ph = c.getNo().get(i);
                System.out.println("Contact "+(i+1)+": "+name + " - "+ph);
            }
        }
        public static void add()
        {
            System.out.println("Enter the name of contact to be added");
            String name = s.nextLine();
            System.out.println("Enter the contact number");
            c.store(name,s.nextLong());
            s.nextLine();
        }
        public static void update()
        {
            System.out.println("Enter the contact to be modified");
            String n = s.nextLine();
            System.out.println("Enter the modified number");
            c.update(n,s.nextLong());
            s.nextLine();
        }
        public static void remove()
        {
            System.out.println("Enter the contact to be removed");
            c.remove(s.nextLine());
        }
        public static void search()
        {
            System.out.println("Enter the contact to be searched");
            c.find(s.nextLine());
        }

    }
