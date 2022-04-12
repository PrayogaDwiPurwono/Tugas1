package com.SuratKaisar;
import java.io.*;
import java.util.*;

public class Main {
    public static void suratkaisar(String isi, int N){
        String chipertext="";
        char huruf;

        for(int i=0; i<isi.length(); i++){
            huruf = isi.charAt(i);
            if((huruf>='a')&&(huruf<='z'))
            {
                huruf = (char)(huruf+N);
                if(huruf>'z'){
                    huruf = (char)(huruf+'a'-'z'-1);
                }
                chipertext =  chipertext + huruf;
            }
            else if((huruf>='A')&&(huruf<='Z'))
            {
                huruf = (char)(huruf+N);
                if(huruf>'Z'){
                    huruf = (char)(huruf+'A'-'Z'-1);
                }
                chipertext =  chipertext + huruf;
            }else
            {
                chipertext =  chipertext + huruf;
            }
        }
        System.out.print(chipertext);
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String huruf;
        int N;

        huruf = input.nextLine();
        N = input.nextInt();

        suratkaisar(huruf, N);
    }
}