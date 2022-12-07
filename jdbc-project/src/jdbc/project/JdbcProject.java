/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.project;

import db.DBHelper;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class JdbcProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      DBHelper.getConnection();
        MahasiswaModel mhs = new MahasiswaModel();
        
        Mahasiswa mhs1 = new Mahasiswa("2117051068", "Siti");
        Mahasiswa mhs2 = new Mahasiswa("2117051029", "Vidya Sinta Billkis");
        Mahasiswa mhs3 = new Mahasiswa("2117051004", "Cindy Loria ");
        Mahasiswa mhs4 = new Mahasiswa("2117051095", "JIhan Haya");
        
        Mahasiswa mhs5 = new Mahasiswa("2117051068");
        // delete 
//            mhs.deleteMahasiswa(mhs3);
        
        //update
        mhs.updateMahasiswa(mhs1, mhs5); 
        //add
//        mhs.addMahasiswa(mhs4);
//          mhs.addMahasiswa(mhs3);
//        mhs.addMahasiswa(mhs2);
//        

        
        ArrayList<Mahasiswa> listMahasiswa = mhs.getMahasiswa();
        
        for (int i =0; i<listMahasiswa.size(); i++){
             System.out.println("Nama : " + listMahasiswa.get(i).getNama());
             System.out.println("NPM  : " + listMahasiswa.get(i).getNpm());
             System.out.println("");
        }
        
//        mhs.addMahasiswa(mhs1);
//          mhs.getMahasiswa();
    }
    
    
}
