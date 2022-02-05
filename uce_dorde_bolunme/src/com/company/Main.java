package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int sayı;
        Scanner input = new Scanner (System.in);
        System.out.print("Bir sayı giriniz: ");
        sayı= input.nextInt();
         int sayıAdedi=0;
         int toplam=0;

         for (int i=0;i<=sayı;i++){
             if( i % 3 == 0 && i % 4 == 0 ){
                 System.out.println(i + " , 3 ve 4 e bölünür:");
                 sayıAdedi ++;
                 toplam += i;

             }

         }
        double ortalama = toplam/sayıAdedi;
        System.out.println( ortalama );

    }
}
