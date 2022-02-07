package com.company;
import java.util.Scanner;
//Pratik - Tek Sayıların Toplamını Bulan Program
public class Main {

    public static void main(String[] args) {
        int sayı;
        Scanner input = new Scanner(System.in);
        int total=0;


        do {
            System.out.print("Sayı giriniz: ");
            sayı = input.nextInt();
             if (sayı % 2 == 0 && sayı % 4 ==0){
                 total += sayı;
             }

        }while ( sayı % 2 == 0 );
        System.out.println("Toplam: " + total);

    }
}
