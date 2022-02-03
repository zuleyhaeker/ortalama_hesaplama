package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int sıcaklık;
        Scanner input=new Scanner(System.in);
        System.out.println("Sıcaklık giriniz: ");
        sıcaklık=input.nextInt();

        if (sıcaklık<5) {
            System.out.println("Kayak yapabilirsiniz.");
        }else if (sıcaklık>=5 && sıcaklık<10 ){
            System.out.println("Sinemaya gidebilirsiniz.");
        }else if (sıcaklık>=10 && sıcaklık<15){
            System.out.println("Sinemaya gidebilir veya piknik yapabilirsiniz");
        }else if (sıcaklık>=15 && sıcaklık<=25){
            System.out.println("Piknik yapılabilir");
        }else {
            System.out.println("Yüzmeye gidilebilir");
        }















        /*

        if (sıcaklık<5){
            System.out.println("Kayak yapabilirsiniz.");
        }else if (sıcaklık>=5 && sıcaklık<15){
            System.out.println("Sinemaya gidebilirsiniz.");
        }else if (15<=sıcaklık && sıcaklık<25){
            System.out.println("Piknik yapılabilir.");
        }else{
            System.out.println("Yüzmeye gidilebilir.");
        }*/

    }
}
