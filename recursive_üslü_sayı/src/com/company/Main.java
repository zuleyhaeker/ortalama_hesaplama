package com.company;
import java.util.Scanner;

public class Main {
    static int üsAlma(int a,int b){

   if (a == 1 || b == 0) { 
            return 1;
        }
        return a * üsAlma(a, b - 1);

    }

    public static void main(String[] args) {

        Scanner input=new Scanner (System.in);
        System.out.print("Taban sayısını giriniz: ");
        int a=input.nextInt();
        System.out.print("Üs sayısını giriniz: ");
        int b=input.nextInt();

        System.out.println("Üs alma= "+ üsAlma(a,b));




    }
}
