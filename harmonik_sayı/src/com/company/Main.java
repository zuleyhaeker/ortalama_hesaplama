package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.println("n sayısı giriniz = ");
        int n = input.nextInt();
        double total=0;
        double harmonik=0;

         for(double i =1; i<=n ;i++){
              harmonik+=(1/i);
         }
        total+=harmonik;
        System.out.println("toplam = " +total);

    }
}
