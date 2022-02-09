package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int right=3;
        String userName,password;


        while (right >0){
            System.out.println("Kullanıcı adınızı giriniz: ");
            userName=input.nextLine();
            System.out.println("Şifrenizi giriniz: ");
            password=input.nextLine();
            //balance=bakiye
            int balance=1500;
            int select;

            if (userName.equals("patika") && password.equals("java123")){
                System.out.println("Giriş başarılı.Kodluyoruz Bankasına hoş geldiniz.");
                do {

                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:");
                    System.out.println("1-para yatırma \n"+
                            "2-para çekme\n"+
                            "3-bakiye sorgula\n"+
                            "4-çıkış yap");
                    select= input.nextInt();
                  switch (select){

                      case 1:
                        System.out.println("Para miktarı : ");
                        int price=input.nextInt();
                        balance+=price;
                        break;

                        case 2:
                          System.out.println("Para miktarı : ");
                        int price2=input.nextInt();
                        if(price2>balance){
                            System.out.println("Yetersiz bakiye");
                        }else {
                            balance -= price2;
                        }
                        break;

                      case 3:
                        System.out.println("Bakiyeniz : " + balance);
                        break;

                    }
                }while(select!=4);
                System.out.println("Tekrar görüşmek üzere");
                break;
            }
            else{
                right--;
                System.out.println("Hatalı giriş yaptınız.Tekrar deneyiniz.");
                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur.Bankanız ile iletişime geçiniz.");
                }else {
                    System.out.println("Kalan giriş hakkı : " + right);
                }
            }}

        }




























       /* Scanner input =new Scanner(System.in);
        String userName, password;
        int right=3;



        while (right >0){
            System.out.println("Kullanıcı adınızı giriniz: ");
            userName=input.nextLine();
            System.out.println("Şifrenizi giriniz: ");
            password=input.nextLine();
            //balance=bakiye
            int balance=1500;
            int select;

            if (userName.equals("patika") && password.equals("java123")){
                System.out.println("Giriş başarılı.Kodluyoruz Bankasına hoş geldiniz.");
                do {

                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz:");
                System.out.println("1-para yatırma \n"+
                        "2-para çekme\n"+
                        "3-bakiye sorgula\n"+
                        "4-çıkış yap");
                select= input.nextInt();
                if (select==1){
                    System.out.println("Para miktarı : ");
                    int price=input.nextInt();
                    balance+=price;
                }else if(select==2){
                    System.out.println("Para miktarı : ");
                    int price=input.nextInt();
                    if(price>balance){
                        System.out.println("Yetersiz bakiye");
                    }else {
                        balance -= price;
                    }

                }else if (select==3) {
                    System.out.println("Bakiyeniz : " + balance);

                }
                }while(select!=4);
                System.out.println("Tekrar görüşmek üzere");
                break;
            }
            else{
                right--;
                System.out.println("Hatalı giriş yaptınız.Tekrar deneyiniz.");
                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur.Bankanız ile iletişime geçiniz.");
                }else {
                    System.out.println("Kalan giriş hakkı : " + right);
                }
            }

        }



*/
    }

