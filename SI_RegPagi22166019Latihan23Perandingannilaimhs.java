/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg22166019.latihan23.perandingannilaimhs;

import java.util.Scanner;

/**
 *
 * @author ASUS
 * NAMA                 : Rachma Fadilah Kurnianto
 * KELAS                : PBO1
 * NIM                  : 222166019
 * Deskripsi Program    : Menentukan nilai terbesar dan terkecil mahasiswa.
 */
public class SI_RegPagi22166019Latihan23Perandingannilaimhs {
    public static void main(String[] args) {
        // Memasukkan scanner dan input
        System.out.println("======Program Terbesar dan Terkecil Nilai Mahasiswa======");
        System.out.println(); 
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        // Menginput nama petugas
        System.out.print("Masukkan nama petugas: ");
        String officerName = input.nextLine();

        // Menginput berapa banyak mahasiswa yang akan dihitung nilainya
        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int nilaimhs = input.nextInt();

        // Menggunakan array untuk menghitung nilai
        int[] grades = new int[nilaimhs];

        // Gunakan loop untuk memasukkan nilai dan menemukan (menentukan) nilai tertinggi dan terendah
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        for (int i = 0; i < nilaimhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            grades[i] = input.nextInt();

            // Masukkan kondisi
            if (grades[i] > highest) {
                highest = grades[i];
            }

            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }

        // Memasukan nilai masing-masing variabel
        System.out.println("======Hasil Nilai Mahasiswa======");
        System.out.println();
        // Output untuk nilai mahasiswa dari yang pertama hingga selesai
        System.out.println("Nilai mahasiswa ke-1: " + grades[0]);
        System.out.println("Nilai mahasiswa ke-2: " + grades[1]);
        System.out.println("Nilai mahasiswa ke-3: " + grades[2]);
        System.out.println("Nilai mahasiswa ke-4: " + grades[3]);
        
        // Print nama petugas, jumlah nilai siswa, nilai tertinggi, dan nilai terendah
        System.out.println("Nilai terbesar: " + highest);
        System.out.println("Nilai terkecil: " + lowest);
        System.out.println("Petugas: " + officerName);
        
    }
}
