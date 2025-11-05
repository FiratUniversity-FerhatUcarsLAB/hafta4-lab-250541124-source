ADI SOYADI : FAİK DURSUN
ÖĞRENCİ NO : 250541124
TARİH: 05.11.2025
GÖREV 2 GEOMETRİK HESAP 


   mport java.util.Scanner;

public class Geometrikhesaplayıcı {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.println("Dairenin yarıçapını giriniz:");
        double r = input.nextDouble();

        double daireninAlan = PI * r * r;
        double dairecevresi = 2 * PI * r;
        double dairecapı = 2 * r;
        double kurehacmi = (4.0 / 3.0)  * PI * r * r *r;
        double kureYuzeyalanı = 4 * PI * r * r;


        System.out.println("\n===================HESAPLAŞMA SONUÇU==============");
        System.out.printf("%-20s : %.2f%n", "Yarıçapı(r)",r);
        System.out.printf("%-20s : %.2f%n","Dairenin alan" ,daireninAlan);
        System.out.printf("%-20s : %.2f%n","Dairecevresi"  ,dairecevresi);
        System.out.printf("%-20s : %.2f%n","kurehacmi"  ,kurehacmi);
        System.out.printf("%-20s : %.2f%n","küreyüzeyalanı" ,kureYuzeyalanı );
        System.out.println("===============================================");

        input.close();

