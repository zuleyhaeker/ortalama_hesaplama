//kendisi hariç bölenleri toplamı kendine eşit olan sayı

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int right=3;
        while(right>0) {

            System.out.print("Bir sayı giriniz: ");
            int number = input.nextInt();
            int toplam = 0;


            for (int a = 1; a < number; a++) {
                if (number % a == 0) {
                    toplam += a;

                }

            }
            right--;

            if (number == toplam) {
                System.out.println(number + " Mükemmel sayıdır.");
            } else {
                System.out.println(number + " Mükemmel sayı değildir.");
            }
        }
    }
}
