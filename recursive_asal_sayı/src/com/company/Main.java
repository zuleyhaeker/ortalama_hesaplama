package com.company;
import java.util.Scanner;

public class Main {


    static void isPrime(int num, int i) {
        if (i == num) {
            System.out.print(num + " is a prime number.");
            return;
        } else if (num%i == 0) {
            System.out.print(num + " is not a prime number.");
            return;
        }

        isPrime(num, i + 1);
    }

        public static void main(String[] args){


            Scanner input = new Scanner(System.in);

            int num;

            System.out.print("Enter a num: ");
            num = input.nextInt();

            isPrime(num, 2);


    }
}
