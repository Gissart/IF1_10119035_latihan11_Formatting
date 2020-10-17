//latihan 11 PBO
// Nama       : Argya Aulia Fauzandika
// NIM        : 10119035
// Kelas      : IF-
// Deskripsi  : menampilkan bilangan yang telah diubah seperti jarak, format, tanda +/-
//              dan mengambil angka dibelakang titik
package com.tugasPBO;

public class formatting {
    public static void main(String[] args){
        int i = 3546764;
        int iMinus = -i;
        System.out.println("i " + i);
        System.out.printf("%%d : $d$n", i);
        System.out.printf("%%10d : %10d%n", i);
        System.out.printf("%%+10d : %+10d%n", i);
        System.out.printf("%%+10d : %+10d%n", iMinus);
        System.out.printf("%%,10d : %,10d%n", i);
        System.out.printf("%%-10d : %-10d%n", i);
        double f = 5675482.982;
        System.out.println("f : "+ f);
        System.out.printf("%%f : %f%n",f);
        System.out.printf("%%.2f : %.2f$n", f);
        System.out.printf("%%12.2f : %12.2f%n",f);
        System.out.printf("%%,12.2f : %,12.2f%n",f);
    }
}
