import java.util.Scanner;

public class kdv_hesaplama {
    public static void main (String [] args){

        /*int para;

        Scanner input = new Scanner (System.in);
        System.out.print("Para değerinizi giriniz: ");
        para = input.nextInt();

        double kdv=0.18;
        double kdvli_fiyat= (para+(para*kdv));
        double kdv_tutarı= (para*kdv);
        System.out.print("Para değerinin KDV'li fiyatı: " + kdvli_fiyat);
        System.out.println(" ");
        System.out.print("Para değerinin KDV tutarı: " + kdv_tutarı);*/

     int para;
     Scanner input= new Scanner(System.in);
        System.out.print("Para değerini giriniz: ");
     para =input.nextInt();

   double oran =(para>1000)? 0.08 : 0.18;
   double kdv_tutarı= para*oran;

        System.out.print(para + " ın KDV tutarı " + kdv_tutarı +" dır." );
        
    }


}
