package Prakt5;

import java.util.Scanner;

public class PemilihanBilangan17 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        // if(angka % 2 == 0){
        //     System.out.println("Angka " + angka + " termasuk bilangan genap");
        // }else{
        //     System.out.println("Angka " + angka + " termasuk bilangan ganjil");
        // }

        String hasil = (angka % 2 == 0) ? "Angka " + angka + " termasuk bilangan genap" : "Angka " + angka + " termasuk bilangan ganjil";
        System.out.println(hasil);

        input.close();
    }
}
