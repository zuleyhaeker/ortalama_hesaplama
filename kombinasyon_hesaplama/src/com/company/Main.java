package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n,r;

        Scanner n1 =new Scanner(System.in);
        System.out.print("N Değerini Giriniz : ");
        n=n1.nextInt();
        System.out.print("R Değerini Giriniz : ");
        r=n1.nextInt();
        int fark= (n-r);

        int nfac=1;
        for (int i =1 ; i<=n; i++){
            nfac=nfac*i;

        }
        System.out.println("N Sayısının Faktöriyeli : " + nfac);

        int rfac=1;
        for (int j =1 ; j<=r; j++){
            rfac=rfac*j;

        }
        System.out.println("R Sayısının Faktöriyeli : "+ rfac);

        int farkfac=1;
        for (int k =1 ; k<=fark; k++){
            farkfac=farkfac*k;

        }
        System.out.println("(N-R)'nin Faktöriyeli : " + farkfac);

        int kombinasyon= nfac/(rfac*farkfac) ;
        System.out.println(n + " Sayısının " + r + "'li" + " Kombinasyonu = " +kombinasyon);


    }
}
