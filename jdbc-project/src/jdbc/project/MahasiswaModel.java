	
/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */

package jdbc.project;



import db.DBHelper;

import java.sql.Connection;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;

import java.util.logging.Level;

import java.util.logging.Logger;



/**

 *

 * @author LENOVO

 */

public class MahasiswaModel {

    private final Connection CONN;



    public MahasiswaModel() {

        this.CONN = DBHelper.getConnection();

    }



    

    //method ADD : MENAMBAH DATA

    public void addMahasiswa(Mahasiswa mhs){

        String insert = "INSERT INTO mhs VALUES ('"

                + mhs.getNpm() + "', '" + mhs.getNama()

                + "');";

        

        try {

            if(CONN.createStatement().executeUpdate(insert) > 0){

            System.out.println("Berhasil Memasukkan Data");

            }else{

                System.out.println("Gagal Memasukkan Data");

            }

        } catch (SQLException ex) {

            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, ex);

            System.out.println("Gagal Memasukkan Data");

        }

        



    }

    

    //Method Delete : MENGHAPUS DATA

    public void deleteMahasiswa(Mahasiswa mhs){

           String delete = "DELETE FROM mhs WHERE npm="+mhs.getNpm();

           try {

            if(CONN.createStatement().executeUpdate(delete) > 0){

            System.out.println("Berhasil Menghapus Data");

            }else{

                System.out.println("Gagal Menghapus Data");

            }

        } catch (SQLException ex) {

            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, ex);

            System.out.println("Gagal Menghapus Data");

        }

       }

       

    //Method Update : Mengupdate Data

       public void updateMahasiswa(Mahasiswa mhs, Mahasiswa mhs1){

           String update = "UPDATE mhs SET npm = '" + mhs.getNpm() + "', nama = '" + mhs.getNama() + "' WHERE npm = '" + mhs1.getNpm() + "';";

        

           try {

            if(CONN.createStatement().executeUpdate(update) > 0){

                System.out.println("Berhasil Update Data");

            }else{

                System.out.println("Gagal Update Data");

            }

        } catch (SQLException ex) {

            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, ex);

            System.out.println("Gagal Update Data");

        }

       }

    

       public ArrayList<Mahasiswa> getMahasiswa(){

           String query = "SELECT * FROM mhs";

           ArrayList<Mahasiswa> mhs = new ArrayList<Mahasiswa>();

           try {

          

            

            ResultSet rs = CONN.createStatement().executeQuery(query);

            while(rs.next()){

                Mahasiswa temp = new Mahasiswa(rs.getString("npm") , rs.getString("nama"));

                mhs.add(temp);

                

            }

               System.out.println("Berhasil mengambil data");

        } catch (SQLException ex) {

            Logger.getLogger(MahasiswaModel.class.getName()).log(Level.SEVERE, null, ex);

               System.out.println("Gagal Mengambil data");

        }

        return mhs;

    }

       

       

}