package com.mycompany.aritgeoharmoortalama;
import java.util.Scanner;
public class AritGeoHarmoOrtalama {

    public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Dizinizin eleman sayisini giriniz: ");
        int n = input.nextInt();
        int[] dizi = new int[n];
        
            for(int i = 0 ; i<= n-1 ; i++){
                System.out.println(i+" indexli eleman: ");
                dizi[i] = input.nextInt();
            }
        int toplam = 0;
            
            for(int i = 0 ; i<n ; i++){
                toplam += dizi[i];
            }
        double aritmetik = toplam/n;
        int carpim = 1;      
            for(int i = 0 ; i<n ; i++){
                carpim *= dizi[i];
            }
        double geometrik = Math.pow(carpim,1.0/n);
        double terstoplam = 1.0/toplam;
        double harmonik = n/terstoplam;
        
        System.out.println("Artimetik ort: "+ aritmetik);
        System.out.println("Geometrik ort: "+ geometrik);
        System.out.println("Harmonik ort: "+ harmonik);
        
    }
}
