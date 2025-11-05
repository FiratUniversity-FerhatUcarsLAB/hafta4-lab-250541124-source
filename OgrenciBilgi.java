/*
 * Ad Soyad: [faik dursun]
 * Ogrenci No: [250541124]
 * Tarih: [05.11.2025]
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class ogrencibilgi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print(" Adınızı giriniz: ");
        String ad = input.nextLine();

        System.out.print(" soyadınız giriniz: ");
        String soyad = input.nextLine();

        System.out.print(" yasınızı giriniz: ");
        int yas = input.nextInt();

        System.out.print(" Ögrenci numarasını giriniz: ");
        int ogrenciNo = input.nextInt();

        System.out.print(" GPA (0,00 - 4,00): ");
        double ogrenciGPA = input.nextDouble();

        System.out.println("\n-------Ögrenci Bilgileri------");
        System.out.println("AD: "+ad);
        System.out.println("SOYAD: "+soyad);
        System.out.println("yas:"+yas);
        System.out.println("GPA: "+ogrenciGPA);
        System.out.println("OGRENCİNO: "+ogrenciNo);

        input.close();

    }
}
