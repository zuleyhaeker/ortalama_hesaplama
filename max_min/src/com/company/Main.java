package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int sayıAdedi;

        System.out.print("Kaç tane sayı gireceksiniz: ");
        sayıAdedi=input.nextInt();
        int enBuyuk=0;
        int enKucuk=9999999;

        int i=1;
         while(i<=sayıAdedi) {
             System.out.print(i + ". sayıyı giriniz: ");
             int number=input.nextInt();
             i++;


             if(number>enBuyuk){
                 enBuyuk=number;

             }

            if (number<enKucuk){

                 enKucuk=number;


             }number++;


         }System.out.println("En büyük sayı : " +enBuyuk);
        System.out.println("En küçük sayı : " +enKucuk);






    }
}
