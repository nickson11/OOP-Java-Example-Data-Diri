/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author 62822
 */

//class DataKup
public class DataKu {
    
//variable
    private String nama;
    private String alamat;
    private int umur;

    public DataKu() {
    nama = "";
    alamat = "";
    umur = 0;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUmur () {
        if (umur <= 5) {
            System.out.println("Kategori      :Balita");
        }
            else if (umur <= 15) {
            System.out.println("Kategori      :Remaja");
        }
            else if (umur >= 16) {
            System.out.println("Kategori      :Remaja");
        }
        return 0;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    

    
    }


