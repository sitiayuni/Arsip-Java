/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisdiagram;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author LENOVO
 */
public class KuisDiagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Titik t = new Titik();
//        t.setX(10);
//        t.setY(5);
//        System.out.println(t.getX());
//        System.out.println(t.getY());
//        
//        Titik t = new Titik(0,0);
//        Titik u = new Titik(3,4);
//        System.out.println(t.distance(u));
        
//         Lingkaran l = new Lingkaran(10);
//        System.out.println("Luas: "+l.luas());
//        System.out.println("Keliling: "+l.keliling());
        
        
//        Titik t = new Titik(12,3);
//        Lingkaran l = new Lingkaran(7.2,t);
//        System.out.println("Luas: "+l.luas());
//        System.out.println("Keliling: "+l.keliling());
//        System.out.println(l.getTitikPusat().getX());
//        System.out.println(l.getTitikPusat().getY());
        
        
        
        Person p = new Person();
        p.setName("Andi");

        LocalDate date = LocalDate.of(2003, Month.JUNE, 5);
        p.setDateOfBirth(date);
//        
        System.out.println(p.getDateOfBirth().toString());
    }
    
        
//          LocalDate date = LocalDate.of(2003, Month.JUNE, 5);
//        Student s = new Student("2007051001","Manajemen Informatika","Andi",date);
//
//        System.out.println(s.getProgramStudi());
        
//        LocalDate date = LocalDate.of(2003, Month.JUNE, 5);
//        PersonInterface s = new Student("2007051001","Manajemen Informatika","Andi",date);
//        
//        s.menulis
}

