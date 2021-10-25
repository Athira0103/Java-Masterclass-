package com.company;

import java.util.ArrayList;

public class contacts {
    private static ArrayList<String> names = new ArrayList<>();
    private static ArrayList<Long> no = new ArrayList<>();

    public static void store(String n,long ph)
    {
        if(names.contains(n))
            System.out.println("The contact is already present.");
        else {
            names.add(n);
            no.add(ph);
        }
    }
    public static void update(String n,long ph)
    {
        if(no.contains(ph))
            System.out.println("The contact is already present.");
        else{
        int position = names.indexOf(n);
        if(position>=0)
        {
           no.set(position,ph);
        }
        }
    }

    public static ArrayList<String> getNames() {
        return names;
    }

    public static ArrayList<Long> getNo() {
        return no;
    }

    public static void remove(String n)
    {
        int position = names.indexOf(n);
        if(position>=0) {
            names.remove(position);
            no.remove(position);
        }
        else
            System.out.println("The given contact is not present in the list");
    }
    public static void find(String n)
    {
        int position = names.indexOf(n);
        if(position>=0)
        {
            System.out.println("The searched contact is found.");
            System.out.println("The phone number is "+no.get(position));
        }
        else
            System.out.println("The searched contact is not found.");
    }

}
