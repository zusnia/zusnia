import java.util.Scanner;
public class cobain {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double suhu;
        String pasien, umur;
       
        System.out.println("===========================================");
        System.out.println("input nanma pasien");
        System.out.println("===========================================");
        System.out.print("pasien ID: ");
        String nama = input.nextLine();
        System.out.print("masukan nama pasien : ");
        String namapasienn = input.nextLine();
        System.out.print("masukan umur pasien : ");
        int umurpasien = input.nextInt();
        System.out.print("Suhu 1: ");
        double suhu1 = input.nextDouble();
        System.out.print("Suhu 2: ");
        double suhu2 = input.nextDouble();
        System.out.print("Suhu 3: ");
        double suhu3 = input.nextDouble();

        double rSuhu = (suhu1 + suhu2 + suhu3) / 3;
        System.out.println("==================================================");
        if (rSuhu >= 36.5 && rSuhu <= 37.5) {
            System.out.println("pasien dengan ID " + nama + " atas nama " + namapasienn + " yang berumur " + umurpasien + " tahun " + " memiliki rata rata suhu tubuh " + rSuhu + " NORMAL ");
        } else {
            System.out.println("Pasien dengan ID " + nama + " atas nama " + namapasienn + " yang berumur " + umurpasien + " tahun " + " memiliki rata-rata suhu tubuh " + rSuhu + " TIDAK NORMAL");
        }
    }
        
    }




     

