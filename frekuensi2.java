/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Gesa Rizky Nugraha
 */
public class frekuensi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Nilai Periode");
        double p = sc.nextInt();
        double f = 1/p;
        System.out.println("Maka Hasil Frekuensi = "+f);
    }
}
