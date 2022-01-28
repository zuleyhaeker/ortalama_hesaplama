import java.util.Scanner;

public class deneme {
    public static void main (String [] args){

       // not ortalaması yapan program

        double matematik,fizik, kimya, turkce,tarih,muzik;

        Scanner input= new Scanner(System.in);

        System.out.print("Matematik notunu giriniz: ");
        matematik=input.nextDouble();

        System.out.print("Fizik notunu giriniz: ");
        fizik=input.nextDouble();

        System.out.print("Kimya notunu giriniz: ");
        kimya=input.nextDouble();

        System.out.print("Türkçe notunu giriniz: ");;
        turkce=input.nextDouble();

        System.out.print("Tarih notunu giriniz: ");
        tarih=input.nextDouble();

        System.out.print("Müzik notunu giriniz: ");
        muzik=input.nextDouble();

        double ortalama;
        ortalama= (matematik+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Ortalama :" + ortalama);
        String sonuc= ortalama>60 ? "SINIFI GEÇTİ" :"SINIFTA KALDI";
        System.out.println(sonuc);







    }
}
