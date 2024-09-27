package Prakt5;

import java.util.Scanner;

public class SIAKAD17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in)   ;
        
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        String nilaiHuruf = "";
        double nilaiSetara = 0;
        String kualifikasi = "";

        System.out.print("Masukkan nama: ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = input.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = input.nextLine().charAt(0);
        System.out.print("Masukkan nomor absen: ");
        absen = input.nextByte();

        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = input.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = input.nextDouble();
        System.out.print("Masukkan nilai ujian: ");
        nilaiUjian = input.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) / 3;
        if (nilaiAkhir >= 80 && nilaiAkhir <=100) {
            nilaiHuruf = "A";
            nilaiSetara = 4;
            kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir >= 73 && nilaiAkhir < 80) {
            nilaiHuruf = "B+";
            nilaiSetara = 3.5;
            kualifikasi = "Lebih dari baik";
        } else if (nilaiAkhir >= 65 && nilaiAkhir < 73) {
            nilaiHuruf = "B";
            nilaiSetara = 3;
            kualifikasi = "Baik";
        } else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
            nilaiHuruf = "C+";
            nilaiSetara = 2.5;
            kualifikasi = "Lebih dari cukup";
        } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
            nilaiHuruf = "C";
            nilaiSetara = 2;
            kualifikasi = "Cukup";
        } else if (nilaiAkhir >= 39 && nilaiAkhir < 50) {
            nilaiHuruf = "D";
            nilaiSetara = 1;
            kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            nilaiSetara = 0;
            kualifikasi = "Gagal";

        }
            //output data
            System.out.printf("\nMahasiswa dengan nama %s (NIM %s) kelas %c nomor absen %d\n", nama, nim, kelas, absen);
            System.out.printf("Nilai akhir: %.2f\n", nilaiAkhir); //format nilai akhir dengan 2 desimal
            System.out.println("Nilai akhir: " + nilaiHuruf);
            System.out.println("kualifikasi: " + kualifikasi);

            input.close();
    }
}
