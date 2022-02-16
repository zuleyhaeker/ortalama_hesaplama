package com.company;
import java.util.Scanner;

public class Main {

    static int sum (int a,int b){
        int result=a+b;
        System.out.println("Toplam= "+result+"\n");
        return result;
    }
    static int minus(int a, int b){
        int result=a-b;
        System.out.println("Çıkarma= "+result+"\n");
        return result;
    }
    static int times(int a, int b){
        int result=a-b;
        System.out.println("Çarpma= "+result+"\n");
        return result;
    }
    static int divided(int a, int b){
        int result=a-b;
        System.out.println("Bölme= "+result+"\n");
        return result;
    }
    static int power(int a, int b){
        int result=1;
        for (int i=1;i<=b;i++){
            result*=a;
        }

        System.out.println("Üs hesabı= "+result+"\n");
        return result;
    }
    static int factorial(int a){
        int result=1;
        for (int i=1;i<=a;i++){
            result *=i;
        }
        System.out.println("Faktöriyel hesabı= "+result+"\n");
        return result;
    }
    static int mod(int a, int b){
        int result=a%b;
        System.out.println("Mod işlemi= "+result+"\n");
        return result;
    }
    static void rectangle(int a, int b){


        System.out.println("Dikdörtgenin alanı= "+ (a*b));
        System.out.println("Dikdörtgenin çevresi= "+ 2*(a+b));
    }


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        String menu= "1- Toplama işlemi\n"+
                     "2- Çıkarma işlemi\n"+
                     "3-Çarpma işlemi\n"+
                     "4- Bölme işlemi\n"+
                     "5-Üslü sayı hesaplama\n"+
                     "6-Faktöriyel hesaplama\n"+
                     "7-Mod alma\n"+
                     "8-Dikdörrtgen alan ve çevre hesabı\n"+
                     "0-Çıkış yap\n";

        while(true) {
        System.out.println(menu);
        System.out.print("İşlem seçiniz: ");
        int select=input.nextInt();

        if(select==0) {
            System.out.println("Güle Güle");
            break;
        }
        if (select>8){
            System.out.print("Geçersiz işlem.");
            break;
        }

        System.out.print("İlk sayı= ");
        int a=input.nextInt();
        System.out.print("İkinci sayı= ");
        int b=input.nextInt();



            switch (select) {


                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a, b);
                    break;
                case 3:
                    times(a, b);
                    break;
                case 4:
                    divided(a, b);
                    break;
                case 5:
                    power(a, b);
                    break;
                case 6:
                    factorial(a);
                    break;
                case 7:
                    mod(a, b);
                    break;
                case 8:
                    rectangle(a, b);
                    break;
                default:
                    System.out.println("Geçersiz işlem.");



            }
        }







    }
}
