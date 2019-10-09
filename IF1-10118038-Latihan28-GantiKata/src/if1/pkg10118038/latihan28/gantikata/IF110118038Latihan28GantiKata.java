/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118038.latihan28.gantikata;
import java.util.Scanner;
/**
 *
 * @author Lingga
 * NAMA : Lingga Purnama Al Hamdi
 * KELAS : IF1
 * NIM : 10118038
 * Deskripsi Program : program ini berisi program yang akan menampilkan Ganti Kata
 */
public class IF110118038Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====Program Mengganti Kata====");
        System.out.print("\n" + "Masukkan Kalimat : ");
        String kalimat = sc.nextLine();
        System.out.print("Ganti Kata : ");
        String ganti = sc.next();
        System.out.print("Menjadi Kata : ");
        String menjadi = sc.next();
        
        System.out.println("\n" + "====Hasil Formatting====");
        System.out.println("Kalimat Awal : " + kalimat);
        System.out.println("Kalimat Baru: " + kalimat.replaceAll(ganti, menjadi));
    }
    
}
