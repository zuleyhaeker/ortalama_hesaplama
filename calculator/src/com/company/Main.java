package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number1,number2,select;

        Scanner input=new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz = ");
        number1=input.nextInt();
        System.out.print("İkinci sayıyı giriniz = ");
        number2=input.nextInt();
        System.out.println("1-toplama\n2-çıkarma\n3-çarpma\n4-bölme");
        System.out.print("Seçim yapınız = ");
        select=input.nextInt();
        switch (select){
            case 1:
                System.out.println("toplama = " +(number1+number2));
                break;
            case 2:
                System.out.println("çıkarma = "+(number1-number2));
                break;
            case 3:
                System.out.println("çarpma = "+ (number1*number2));
                break;
            case 4:
                switch (number2){
                    case 0:
                        System.out.println("bir sayı 0 a bölünemez.");
                        break;
                    default:
                        System.out.println("bölme = "+ (number1/number2));
                        break;
                }break;
            default:
                System.out.println("yanlış seçim yaptınız");
        }
    }
}

