/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Gesa Rizky Nugraha
 */
public class frekuensi {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Nilai Jumlah Getaran");
        double n = sc.nextInt();
        System.out.println("Masukan Nilai Waktu Getaran");
        double t = sc.nextInt();
        double hasilf = n / t;
        System.out.println("Maka Hasil Frekuensi=  " + hasilf);
    }
}
