/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Gesa Rizky Nugraha
 */
public class frekuensi1 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Nilai Kecepatan Gelombang");
        double v1 = sc.nextInt();
        System.out.println("Masukan Nilai Panjang Gelombang");
        double v2 = sc.nextInt();
        double hasilf = v1 / v2;
        System.out.println("Maka Hasil Frekuensi=  " + hasilf);
    }
}
