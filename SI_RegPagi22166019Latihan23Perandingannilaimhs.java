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
        System.out.println("======Program Terbesar dan Terkecil Nilai Mahasiswa======");
        System.out.println(); 
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        // Input the name of the officer
        System.out.print("Masukkan nama petugas: ");
        String officerName = input.nextLine();

        // Input the number of student grades
        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int numGrades = input.nextInt();

        // Use an array to store the grades
        int[] grades = new int[numGrades];

        // Use a loop to input the grades and find the highest and lowest values
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        for (int i = 0; i < numGrades; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            grades[i] = input.nextInt();

            if (grades[i] > highest) {
                highest = grades[i];
            }

            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }

        System.out.println("======Hasil Nilai Mahasiswa======");
        System.out.println();
        // Output the first four student grades
        System.out.println("Nilai mahasiswa ke-1: " + grades[0]);
        System.out.println("Nilai mahasiswa ke-2: " + grades[1]);
        System.out.println("Nilai mahasiswa ke-3: " + grades[2]);
        System.out.println("Nilai mahasiswa ke-4: " + grades[3]);
        
        // Output the name of the officer, the number of student grades, the highest grade, and the lowest grade
        System.out.println("Nilai terbesar: " + highest);
        System.out.println("Nilai terkecil: " + lowest);
        System.out.println("Petugas: " + officerName);
        
    }
}