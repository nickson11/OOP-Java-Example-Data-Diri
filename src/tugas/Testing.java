/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author 62822
 */
public class Testing{

    public static void main(String[] args) {
        
    String nama;
    String alamat;
    int umur;
    Scanner scnr = new Scanner(System.in);
    
    //instansiasi
    DataKu data = new DataKu();
    
        System.out.println("PROGRAM NAMA DAN MENENTUKAN UMUR");
        System.out.println("================================");       
        System.out.print("Siapakah Namamu :");
        nama = scnr.nextLine();
        System.out.print("Dimana Alamat : ");
        alamat = scnr.nextLine();
        System.out.print("Berapa Umurmu : ");
        umur = scnr.nextInt();
        
        System.out.println("");
        
        //setdata
        data.setNama(nama);
        data.setUmur(umur);
        data.setAlamat(alamat);
        
        //getdata
        System.out.println("HASIL DARI PROGRAM");
        System.out.println("==================================");
        System.out.println("Nama Adalah   :" + data.getNama());
        System.out.println("Alamat        :" + data.getAlamat());
        System.out.println("Umur          :" + umur);
        System.out.print(data.getUmur());
    } 
}
