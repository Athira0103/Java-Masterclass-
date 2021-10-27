package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static Scanner s = new Scanner(System.in);
    private static Grocery grocerys = new Grocery();

    public static void main(String[] args)
    {
        boolean quit = false;
        int choice = 0;
        printInst();
        while(!quit)
        {
            System.out.println("Enter your choice ");
            choice = s.nextInt();
            s.nextLine();
            switch (choice) {
                case 0:
                    printInst();
                    break;
                case 1:
                    grocerys.print();
                    break;
                case 2:
                    add();
                    break;
                case 3:
                    modify();
                    break;
                case 4:
                    remove();
                    break;
                case 5:
                    find();
                    break;
                case 6:
                    process();
                    break;
                case 7:
                    quit = true;
                   break;
            }
            }
        }
        public static void printInst()
        {
            System.out.println("Enter ");
            System.out.println("0 - to print choices");
            System.out.println("1 - to print the list");
            System.out.println("2 - to add an item");
            System.out.println("3 - to modify an item");
            System.out.println("4 - to remove an item");
            System.out.println("5 - to search for an item");
            System.out.println("6 - to quit");
        }
        public static void add()
        {
            System.out.println("Enter the item");
            grocerys.add(s.nextLine());
        }
        public static void modify()
        {
            System.out.println("Enter the item to be replaced");
            String item = s.nextLine();
            System.out.println("Enter the replacement item");
            grocerys.modify(item,s.nextLine());
        }
        public static void remove()
        {
            System.out.println("Enter the element to be removed");
            grocerys.remove(s.nextLine());
        }
        public static void find()
        {
            System.out.println("Enter the element to be searched");
            if(grocerys.find(s.nextLine())!=null)
                System.out.println("Found the item.");
            else
                System.out.println("The given item was not found");
        }
        public static void process()
        {
            ArrayList<String> newal = new ArrayList<>();
            newal.addAll(grocerys.getGrocery());
            ArrayList<String> another = new ArrayList<>(grocerys.getGrocery());
            String a[] = new String[grocerys.getGrocery().size()];
            a= grocerys.getGrocery().toArray(a);

        }
    }

