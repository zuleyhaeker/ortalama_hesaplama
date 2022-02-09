package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number =input.nextInt();

        for (int i=1; i<=number;i++){
            //boşluk oluşturma
            for (int k = 0; k <= (number - i); k++) {
                System.out.print(" ");
            }
            //yıldız oluşturma
            for (int j =1 ; j<= 2*i-1 ;j++){
                System.out.print("*");

            }

            System.out.println(" ");
        }

        //ters üçgen oluşturma

        for (int a=number-1; a>=1;a--){
            //boşluk oluşturma
            for (int k = 0; k <= (number - a); k++) {
                System.out.print(" ");
            }
            //yıldız oluşturma
            for (int j =2*a-1 ; j>=1  ;j--){
                System.out.print("*");

            }

            System.out.println(" ");
        }

        /*Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }*/


    }
}

