package com.company;
import  java.util.Scanner;

public class Main {

   public static void main(String[] args) {
        int mat,fizik,turkce,kimya,müzik;
        int gecmenotu=55;
        int dersSayısı=0;
        int toplam=0;
        double ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz: ");
        mat = input.nextInt();
       if (mat > 0 && mat <= 100) {
           toplam += mat;
           dersSayısı++;
       }

        System.out.print("Fizik notunu giriniz: ");
        fizik=input.nextInt();
       if (fizik > 0 && fizik <= 100) {
           toplam += fizik ;
           dersSayısı++;
       }

        System.out.print("Türkçe notunu giriniz: ");
        turkce=input.nextInt();
       if (turkce > 0 && turkce <= 100) {
           toplam += turkce;
           dersSayısı++;
       }

        System.out.print("Kimya notunu giriniz: ");
        kimya=input.nextInt();
       if (kimya > 0 && kimya <= 100) {
           toplam += kimya;
           dersSayısı++;
       }

        System.out.print("Müzik notunu giriniz: ");
        müzik=input.nextInt();
       if (müzik > 0 && müzik <= 100) {
           toplam += müzik;
           dersSayısı++;
       }

       ortalama=toplam/dersSayısı;


        if(ortalama<55){
            System.out.println("Dersten kaldınız.");
        }else{
            System.out.println("Dersi geçtiniz.");
        }
       System.out.println(ortalama);

    }

}
