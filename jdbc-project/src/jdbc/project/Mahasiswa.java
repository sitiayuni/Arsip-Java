/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.project;

/**
 *
 * @author LENOVO
 */
public class Mahasiswa {
    private String npm;
    private String nama;

    public Mahasiswa(String npm, String nama) {
        this.npm = npm;
        this.nama = nama;
    }

    public Mahasiswa(String npm) {
        this.npm = npm;
    }
    
    

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    
}
