package com.company;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> cities=new LinkedList<String>();
        addInOrder(cities,"Dhaka");
        addInOrder(cities,"Mymensingh");
        addInOrder(cities,"Chittagong");
        addInOrder(cities,"Khulna");
        addInOrder(cities,"Barishal");
        addInOrder(cities,"Sylhet");
        printList(cities);
        addInOrder(cities,"Rajshahi");
        addInOrder(cities,"Dhaka");
        printList(cities);
        showOptions();
        guidingTour(cities);


    }

    private static void guidingTour(LinkedList<String> cities) {
        boolean exit=false;
        Scanner scanner=new Scanner(System.in);
        ListIterator<String> iterator=cities.listIterator();


        while (!exit){
            int option =scanner.nextInt();
            scanner.nextLine();
            switch (option){
                case 0:
                    System.out.println("Vacation is Over");
                    exit=true;
                    break;
                case 1:
                    if(iterator.hasNext()){
                    System.out.println("Now City is: "+iterator.next());}
                    else {
                        System.out.println("Reached at the end of the List");
                    }
                    break;
                case 2:
                    if(iterator.hasPrevious()){
                        System.out.println("Now City is:"+iterator.previous());
                    }
                    else{
                        System.out.println("Starting of the list.");
                    }
                    break;

                case 3:
                    showOptions();
            }
        }

    }

    private static void showOptions() {
        System.out.println("The options are:");
        System.out.println("\t 0 to quit.");
        System.out.println("\t 1 to next city.");
        System.out.println("\t 2 to previous city.");
        System.out.println("\t 3 to options.");
    }

    private static boolean addInOrder(LinkedList<String> cities,String newPlace) {
        ListIterator <String> i=cities.listIterator();
        while (i.hasNext()){
            int compare=i.next().compareTo(newPlace);
            if(compare==0){
                System.out.println("Already Exists: ");
                return false;
            }
            else if(compare>0){
                //cities.add(i.previous());
                i.previous();
                i.add(newPlace);
                return true;

            }

        }
        i.add(newPlace);
        return true;
    }

    private static void printList(LinkedList<String> cities) {
        Iterator <String> i=cities.iterator();
        while (i.hasNext()){
            System.out.println("Now available in: "+i.next());
        }
        System.out.println("========================");

    }

}
