package com.company;
import java.util.ArrayList;

import java.util.ArrayList;

public class Grocery
{
    private ArrayList<String> grocery = new ArrayList<>();
    public void add(String item)
    {
        grocery.add(item);
    }

    public ArrayList<String> getGrocery() {
        return grocery;
    }

    public void print()
    {
        System.out.println("You have "+ grocery.size()+" items in the list.");
        for(int i=0;i<grocery.size();i++)
            System.out.println((i+1)+". "+grocery.get(i));
    }
    public void modify(String item,String newitem) {
        int p = grocery.indexOf(item);
        if (p >= 0) {
            grocery.set(p, newitem);
            System.out.println("Item at " + (p + 1) + " has been modified.");
        }
    }
    public void remove(String s)
    {
        int p = grocery.indexOf(s);
        if(p>=0) {
            System.out.println("The item to be deleted is " + grocery.get(p));
            grocery.remove(p);
        }
    }
    public String find(String s)
    {
        //boolean exist = grocery.contains(s);
        int position = grocery.indexOf(s);
        if(position>=0)
            return grocery.get(position);
        else
            return null;
    }
}
