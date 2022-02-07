package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int a,b;
        int total=1;


        Scanner input=new Scanner (System.in);
        System.out.print("üssü alınacak sayıyı giriniz= ");
        a=input.nextInt();
        System.out.print("üs olacak sayıyı giriniz= ");
        b=input.nextInt();


        for (int i=1;i<=b;i++){
            total=total*a;



        }
        System.out.println(a+ " üssü "+b +" = " + total);


    }
}
