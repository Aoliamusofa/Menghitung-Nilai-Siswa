package Tugas;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        Siswa siswa=new Siswa(18210002,"Aolia Musofa");
        siswa.cetak_siswa();
        System.out.println("==========Input Data Matapelajaran=========");
        Nilai nilai=new Nilai();
        System.out.print("Kode Matapelajaran =");
        nilai.kdmt= obj.nextLine();
        System.out.print("Nama Matapelajaran =");
        nilai.nmmt= obj.nextLine();
        System.out.println("=========Data Matapelajaran=========");
        nilai.cetakmt();
        System.out.println("=========Data Nilai==========");
        System.out.print("Jumlah Kehadiran =");
        nilai.nilai_absen= obj.nextInt();
        System.out.print("Nilai Tugas =");
        nilai.nilai_tugas= obj.nextInt();
        System.out.print("Nilai UTS =");
        nilai.nilai_uts= obj.nextInt();
        System.out.print("Nilai UAS =");
        nilai.nilai_uas= obj.nextInt();
        nilai.addnilai();
        System.out.println("==========Status Nilai==========");
        nilai.getRata_rata();
        nilai.cetak_nilai();
        System.out.println("=================================");
        nilai.ceta_status();


    }
}
