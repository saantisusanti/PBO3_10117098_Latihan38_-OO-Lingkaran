/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan38_.oo.lingkaran;

/**
 *
 * @author 
 * NAMA     : Santi Susanti
 * KELAS    : PBO3
 * NIM      : 10117098
 * Deskripsi Program : program ini berisi program untuk menampilkan perhitungan 
 *                     lingkaran  yang di input oleh user dengan konsep OOP
 */
public class PBO3_10117098_Latihan38_OOLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lingkaran lingkar = new Lingkaran();

        System.out.println("=======Perhitungan Lingkaran=======");
        lingkar.validasiInput();
        lingkar.hasilPerhitungan(lingkar.diameter);
    }
    
}
