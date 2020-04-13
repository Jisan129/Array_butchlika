package com.company;

import java.util.Scanner;

import static java.util.Collections.swap;
import static java.util.Collections.synchronizedCollection;

public class Main {
    static Scanner scanner=new Scanner(System.in);

    static Contact contact=new Contact();

    public static void main(String[] args) {
        // write your code here
        printInstructions();
        boolean exit=false;
        int choice;
        while (!exit){
            choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:printInstructions();
                     break;
                case 1:printContacts();
                     break;
                case 2:addContacts();
                     break;
                case 3:removeContacts();
                     break;
                case 4:searchContacts();
                     break;
                case 5:updateContacts();
                     break;
                case 6:exit=true;
            }
        }

    }

    private static void updateContacts() {
        contact.update(scanner.next(),scanner.next(),scanner.next());
    }

    private static int searchContacts() {
          int c=contact.searchNumber(scanner.next());
          if(c==0){
              printInstructions();
          }
          return 0;
    }

    private static void removeContacts() {
          contact.removeNumber(scanner.next());
    }

    private static void addContacts() {
        contact.addNumber(scanner.next(),scanner.next());

    }

    public static void printContacts(){
        System.out.println("The contacts are: ");
        contact.showList();
    }
    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the Contact list.");
        System.out.println("\t 2 - To add an item to the Contact.");
        System.out.println("\t 3 - To remove an item from the Contact.");
        System.out.println("\t 4 - To Search an item to the Contact.");
        System.out.println("\t 5 - To Update for an item in the Contact.");
        System.out.println("\t 6 - To quit the application.");
    }
}
