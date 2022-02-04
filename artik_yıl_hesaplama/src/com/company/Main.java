package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int yil ;
	Scanner input =new  Scanner (System.in);
        System.out.println("Yıl Giriniz: ");
        yil =input.nextInt();

        boolean artikMi = false;

        if(yil % 4 == 0)
        {
            if( yil % 100 == 0)
            {
                if ( yil % 400 == 0)
                    artikMi = true;
                else
                    artikMi = false;
            }
            else
                artikMi = true;
        }
        else {
            artikMi = false;
        }

        if(artikMi==true)
            System.out.println(yil + " artık bir yıldır.");
        else
            System.out.println(yil + " artık bir yıl değildir.");


    }
}
