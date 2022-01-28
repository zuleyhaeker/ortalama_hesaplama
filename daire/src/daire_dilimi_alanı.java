import java.util.Scanner;


public class daire_dilimi_alanı {
    public static void main(String[] args) {

        int r,a;
        double pi=3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz : ");
        r=input.nextInt();
        System.out.print("Merkez açının ölçüsünü giriniz : ");
        a=input.nextInt();

        double alan = (pi*(r*r)*a)/360;
        System.out.println("Daire diliminin alanı = "+ alan );









/*Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını
      ve çevresini hesaplayan programı yazın.
        int r;
        double pi=3.14;
        Scanner input=new Scanner(System.in);
        System.out.print("Dairenin yarı çapını giriniz : ");
        r=input.nextInt();
        double alan = pi*r*r;
        double cevre=2*pi*r;
        System.out.println("Dairenin alanı = "+ alan +" çevresi = "+ cevre);*/

    }
}
