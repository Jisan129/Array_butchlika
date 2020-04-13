package com.company;

import java.util.Scanner;

import static java.util.Collections.swap;
import static java.util.Collections.synchronizedCollection;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] number=new int[100];
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        for(int i=0;i<a;i++){
            number[i]=getInteger();
        }

           printInteger(number,a);

        sortArray(number,a);
    }

    private static int sortArray(int[] number,int a) {
        for(int i=0;i<a-1;i++){
            for(int j=i+1;j<a;j++){
                if(number[i]>number[j]){
                    int temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }
        }
        printInteger(number,a);
        return 0;
    }


    private static void printInteger(int[] number,int a) {
       for(int i=0;i<a;i++) {
           System.out.println(" " + number[i]);
       }
    }

    private static int getInteger() {
        Scanner scanner=new Scanner(System.in);
        int b=scanner.nextInt();
        return b;

    }
}
