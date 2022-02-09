package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
   //Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
        //
        //Örnek : 1643 = 1 + 6 + 4 + 3 = 14
        Scanner input =new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
         int number =input.nextInt();
         int basNumberr=0;
         int toplam=0;


         while(number != 0){
             basNumberr=number%10;
             toplam += basNumberr;

             number=number/10;
             System.out.println(basNumberr);

         }
        System.out.println("Basamak toplamı = " +toplam);
    }
}
