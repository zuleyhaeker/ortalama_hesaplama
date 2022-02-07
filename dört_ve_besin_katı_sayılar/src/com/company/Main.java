package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int number;
        Scanner scan = new Scanner (System.in);
        System.out.print("Sayı giriniz: ");
        number= scan.nextInt();

        System.out.println("Girilen sayıya kadar olan 4 ün kuvvetleri:");
        for (int i =1;i <= number ;i*=4){

            System.out.println(i);

        }
        System.out.println("Girilen sayıya kadar olan 5 in kuvvetleri");
        for (int i =1;i <= number ;i*=5){

            System.out.println(i);

        }


    }
}
