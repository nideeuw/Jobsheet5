package Prakt5;

import java.util.Scanner;

public class PemilihanHariDenganIf17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan angka: ");
        int angka = input.nextInt();

        if(angka >= 1 && angka <= 5){
            System.out.println("Weekday");
        } else if(angka == 6 || angka == 7){
            System.out.println("Weekend");
        }else{
            System.out.println("Invalid number");
        }

        input.close();
    }
}
