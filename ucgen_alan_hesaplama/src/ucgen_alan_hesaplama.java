import java.util.Scanner;

public class ucgen_alan_hesaplama {
    public static void main(String[] args) {
        int a,b,c;
        Scanner input= new Scanner(System.in);
        System.out.print("Üçgenin kenar uzunluklarını giriniz: ");
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();

        double u =(a+b+c)/2;

        double alan =Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı = " + alan );





    }

}
