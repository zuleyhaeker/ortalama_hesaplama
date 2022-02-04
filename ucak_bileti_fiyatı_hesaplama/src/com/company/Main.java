package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int km, yas;
        String yolculukTipi;

        double kmOranı = 0.10;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();


        System.out.println("Yolculuk tipini giriniz\n1 => Tek Yön\n2 => Gidiş Dönüş ");
        int select = input.nextInt();
        if ((km < 0 || yas < 0) || (select == 1 && select == 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }
        double ucret = km * kmOranı;

        switch (select) {
            case 1:
                if (yas < 12) {
                    double oran = 0.50;
                    double newUcret = ucret * oran;
                    System.out.println("Toplam tutar = " + newUcret);
                    return;
                } else if (12 <= yas && yas <= 24) {
                    double newUcret = ucret - (ucret * 0.10);
                    System.out.println("Toplam tutar = " + newUcret);
                    return;
                } else if (24<yas && yas <=65) {
                    System.out.println("Toplam tutar = " + ucret);
                    return;
                }else{
                    double newUcret = ucret - (ucret * 0.30);
                    System.out.println("Toplam tutar = " +newUcret);
                    return;
                }
            case 2:
                if(yas<12){

                    double a=ucret-(ucret*0.50);
                    double newUcret= a -(a*0.20);
                    System.out.println("Toplam tutar = "+ 2* newUcret);
                    return;
                }else if (12<=yas && yas<=24){
                    double a =ucret-(ucret*0.10);
                    double newUcret= a -(a*0.20);
                    System.out.println("Toplam tutar = "+ 2*newUcret);
                    return;
                }else if(24<yas && yas <=65){
                    double newUcret=ucret-((ucret*0.20));
                    System.out.println("Toplam tutar = "+ 2*newUcret);
                    return;
                }else{
                    double a = ucret - (ucret * 0.30);
                    double newUcret = a - (a *0.20);
                    System.out.println("Toplam tutar = " + 2*newUcret);
                    return;
                }
        }

        }
    }
