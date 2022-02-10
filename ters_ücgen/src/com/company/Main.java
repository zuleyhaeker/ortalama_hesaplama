package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner number=new Scanner (System.in);


        System.out.print("Basamak sayısını giriniz: ");
        int n=number.nextInt();

        for (int i=n; i>=1;i--){
            //boşluk oluşturma
            for (int k = 0; k <= (n - i); k++) {
                System.out.print(" ");
            }
            //yıldız oluşturma
            for (int j =2*i-1 ; j>=1  ;j--){
                System.out.print("*");

            }

            System.out.println(" ");
        }


















    }
}
