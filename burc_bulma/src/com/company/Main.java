package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        String ay ;
        int gün ;
        Scanner input=new Scanner(System.in);

        System.out.print("Doğduğunuz ayı giriniz: ");
        ay =input.nextLine();
        System.out.print("Doğduğunuz günü giriniz: ");
        gün =input.nextInt();

        if(gün >=1 && gün<=32){
        if (ay.equals("Nisan ") || ay.equals("nisan")){
            if (1<=gün && gün<21){
                System.out.println("Koç burcusunuz.");
            }else{
                System.out.println("Boğa burcusunuz.");
            }
        }


        if (ay.equals("Mayıs") || ay.equals("mayıs")){
            if (1<= gün && gün<22){
                System.out.println("Boğa burcusunuz.");
            }else{
                System.out.println("İkizler burcusunuz.");
            }

        }
        if (ay.equals("Haziran") || ay.equals("haziran")){
            if (1<= gün && gün<23){
                System.out.println("İkizler burcusunuz.");
            }else{
                System.out.println("Yengeç burcusunuz.");
            }

        }
        if (ay.equals("Temmuz") || ay.equals("temmuz")){
            if (1<= gün && gün<23){
                System.out.println("Yengeç burcusunuz.");
            }else{
                System.out.println("Aslan burcusunuz.");
            }

        }
        if (ay.equals("Ağustos") || ay.equals("ağustos")){
            if (1<= gün && gün<23){
                System.out.println("Aslan burcusunuz.");
            }else{
                System.out.println("Başak burcusunuz.");
            }

        }
        if (ay.equals("Eylül") || ay.equals("eylül")){
            if (1<= gün && gün<23){
                System.out.println("Başak burcusunuz.");
            }else{
                System.out.println("Terazi burcusunuz.");
            }

        }
        if (ay.equals("Ekim") || ay.equals("ekim")){
            if (1<= gün && gün<23){
                System.out.println("Terazi burcusunuz.");
            }else{
                System.out.println("Akrep burcusunuz.");
            }

        }
        if (ay.equals("Kasım") || ay.equals("kasım")){
            if (1<= gün && gün<22){
                System.out.println("Akrep burcusunuz.");
            }else{
                System.out.println("Yay burcusunuz.");
            }

        }
        if (ay.equals("Aralık") || ay.equals("aralık")){
            if (1<= gün && gün<22){
                System.out.println("Yay burcusunuz.");
            }else{
                System.out.println("Oğlak burcusunuz.");
            }

        }
        if (ay.equals("Ocak") || ay.equals("ocak")){
            if (1<= gün && gün<22){
                System.out.println("Oğlak burcusunuz.");
            }else{
                System.out.println("Kova burcusunuz.");
            }

        }
        if (ay.equals("Şubat") || ay.equals("şubat")) {
            if (1 <= gün && gün < 20) {
                System.out.println("Kova burcusunuz.");
            } else {
                System.out.println("Balık burcusunuz.");
            }

            if (ay.equals("Mart") || ay.equals("mart")) {
                if (1 <= gün && gün < 21) {
                    System.out.println("Balık burcusunuz.");
                } else {
                    System.out.println("Koç burcusunuz.");
                }
            }
        }

        }
        else {
            System.out.println("geçersiz sayı girdiniz.");
        }
    }
}
