package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz: ");
        int number=input.nextInt();
        int n1=0;
        int n2=1;
        int n3;
        System.out.print(n1+" "+n2);
        for (int i=2;i<=number;i++){
            n3=n1+n2;
            System.out.print(" " +n3);
            n1=n2;
            n2=n3;
        }
        System.out.println(" ");
    }
}
