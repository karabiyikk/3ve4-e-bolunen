package Donguler;

import java.util.Scanner;

//Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların
// ortalamasını hesaplayan programı yazınız.
public class TamBolunen {
    public static void main(String[] args) {
        int i, sayi, toplam = 0, bolunenSayi = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        sayi = input.nextInt();

        for (i = 0; i <= sayi; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                toplam += i;
                bolunenSayi += 1;
            }
        }
        System.out.println("3 ve 4 e bölünen sayıların ortalaması : " + (toplam / bolunenSayi));
    }
}
