package com.company;
import java.io.*;
import java.util.*;
public class Selde {
    public static int angka(int a){
        int angka = 0, x = a;
        while(x!=0){
            angka = angka*10+(x%10);
            x     = x/10;
        }
        return angka;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balik, terbalik;
        balik    = input.nextInt();
        terbalik = angka(balik);

        if(balik==terbalik){
            System.out.println(balik+" adalah selde.");
        }else{
            System.out.println(balik+" bukan selde.");
        }
    }
}
