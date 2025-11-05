faik dursun
  250541124
05.11.2025
  maas hesap java
  import java.util.Scanner;

public class maasHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //SABİT TANIMLAR
        final double SGK_ORANI = 0.14;
        final double GELİR_VERGİSİ_ORANI = 0.15;
        final double Damga_vergisi_oranı = 0.00759;


        // -----BİLGİ GİRİŞİ------------
        System.out.print("ÇALIŞAN ADI SOYADI");
        String adsoyad = input.nextLine();

        System.out.print("Aylık BrÜT MAAŞ");
        double brutMaas  = input .nextDouble();

        System.out.print("HAFTALIK ÇALIŞMA  SAATİ ");
        double haftaliksaat = input.nextDouble();

        System.out.print("HAFTALIK MESAİ SAATİ ");
        double mesaisaat = input.nextDouble();

        // --------------HESAPLAMALAR-------------

        // 1.GELİRLER
        double mesaiücreti = ( brutMaas / 160 )*mesaisaat* 1.5 ;
        double toplamGeilr = brutMaas + mesaiücreti ;

        // 2.Kesintiler
        double sgk = toplamGeilr*SGK_ORANI;
        double gelirvergisi = toplamGeilr*GELİR_VERGİSİ_ORANI;
        double damgavergisi = toplamGeilr*Damga_vergisi_oranı;
        double toplamKesinti = sgk + gelirvergisi +damgavergisi;

        // 3.Net maas
        double netMaas = toplamGeilr - toplamKesinti;

        //4.İSTATİSLİKLER
        double kesintiOrani = (toplamKesinti / toplamGeilr)*100;
        double saatliknetkazanc = netMaas / 176;
        double gunluknetkazanc = netMaas / 22;

        // ------------ÇIKTILAR------------
        System.out.println("\n===========MAAŞ BODROSU===============");
        System.out.printf("Çalışan: %s%n",adsoyad);
        System.out.printf("AYLIK BRÜT MAAŞ: %.2f%n",brutMaas);
        System.out.println("MESAİ SAATİ:" + mesaisaat);
        System.out.printf("Mesai ücreti: %.2f  TL%n",mesaiücreti);
        System.out.printf("TOPLAM GELİR :%.2f  TL%n",toplamGeilr);
        System.out.println("----------------------------------");
        System.out.printf("SGK KESİNTİSİ (%.0f%%): %.2f TL%n", SGK_ORANI*100, sgk);
        System.out.printf("Gelir Vergisi (%.0f%%): %.2f TL%n", GELİR_VERGİSİ_ORANI*100, gelirvergisi);
        System.out.printf("DAMGA VERGİSİ (%.3f%%): %.2f TL%n", Damga_vergisi_oranı*100, damgavergisi );
        System.out.printf("Toplam kesinti: %.2f  TL%n " ,toplamKesinti);
        System.out.println("____________________________");
        System.out.printf("NET MAAŞ : %.2f TL%n",netMaas);
        System.out.println("_____________________________");
        System.out.printf("KESİNTİ ORANI : %.2f %% %n",kesintiOrani );
        System.out.printf("SAATLİK NET KAZANÇ : %.2f TL %n" ,saatliknetkazanc);
        System.out.printf("GÜNLÜK NET KAZANÇ : %2f TL %n",gunluknetkazanc);
        System.out.println("_____________________________");

        input.close();
