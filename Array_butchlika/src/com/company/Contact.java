package com.company;

import java.util.ArrayList;

public class Contact {
    private ArrayList<String> name=new ArrayList<String>();
    private ArrayList<String> number=new ArrayList<String>();
    public void addNumber(String item,String dialNumber){
        name.add(item);
        number.add(dialNumber);
    }

    public void removeNumber(String item){
        int position=name.indexOf(item);
        name.remove(position);
        number.remove(position);
    }
    public int searchNumber(String item){
        int position=name.indexOf(item);

        if(position>=0) {
            System.out.println("Position " + (position + 1) + " Name: " + name.get(position) + " number: " + number.get(position));
            return 1;
        }
        else {
            System.out.println("Invalid Name.");
            return 0;
        }
    }
    public void showList( ){
        int j=name.size();

        for(int i=0;i<j;i++){
            System.out.println(name.get(i)+" "+number.get(i));
        }
    }


    public void update(String from, String to,String num) {
         int position=name.indexOf(from);
         name.set(position,to);
        // number.set(position,number);
        number.set(position,num);

    }
}
