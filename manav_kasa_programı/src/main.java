import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int armut, elma, domates, muz, patlıcan;
        Scanner input = new Scanner(System.in);

        double armutfiyat=2.14;
        double elmafiyat=3.67;
        double domatesfiyat=1.11;
        double muzfiyat=0.95;
        double patlıcanfiyat=5.00;


        System.out.print("Armut kaç kilo ? : ");
        armut=input.nextInt();

        System.out.print("Elma kaç kilo ? : ");
        elma=input.nextInt();

        System.out.print("Domates kaç kilo ? : ");
        domates=input.nextInt();

        System.out.print("Muz kaç kilo ? : ");
        muz=input.nextInt();

        System.out.print("Patlıcan kaç kilo ? : ");
        patlıcan=input.nextInt();

        double tutar = ((armut*armutfiyat)+(elma*elmafiyat)+(domates*domatesfiyat)+
                (muz*muzfiyat)+(patlıcan*patlıcanfiyat));
        System.out.print("Toplam tutar : " + tutar);

    }
}