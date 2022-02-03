package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userName ,password;
        int select;

        Scanner input =new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        userName= input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password= input.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yapıldı.");
        }else{
            System.out.println("Giriş yapılamadı.Yeni şifre oluşturmak için 1'e basınız");

            select= input.nextInt();

            switch (select){
                case 1 :
                    System.out.println("Yeni şifreyi giriniz: ");
                    Scanner inp=new Scanner(System.in);
                    String newPassword=inp.nextLine();
                    if (newPassword.equals("java123")){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                        break;

                    }else{
                        System.out.println("giriş başarılı");
                    }

            }







        }



    }
}
