/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toshiba
 */
public class BiodataSaya {
    public static void main(String[] args) {
        String nama;
        int umur;
        String alamat;
        final String TANGGAL_LAHIR;
        
        nama = "Riki Widiantoro";
        umur = 20;
        alamat = "Belang, Bungkal, Ponorogo";
        TANGGAL_LAHIR = "15 November 1998";
        
        System.out.println("Nama saya adalah " + nama);
        System.out.print("Saya berumur " + umur + " tahun");
        System.out.println(" dan beralamat " + alamat);
        System.out.println("Selain itu, saya lahir pada tanggal " + TANGGAL_LAHIR);
    }
}
