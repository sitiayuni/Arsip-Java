/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisdiagram;

/**
 *
 * @author LENOVO
 */

public class Lingkaran {
    private double radius;
    private Titik titikPusat; 

    public Lingkaran(double radius, Titik titikPusat) {
        this.radius = radius;
        this.titikPusat = titikPusat;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Titik getTitikPusat() {
        return titikPusat;
    }

    public void setTitikPusat(Titik titikPusat) {
        this.titikPusat = titikPusat;
    }
    
    public double luas(){
        return Math.PI*(this.radius*this.radius);
    }
    
    public double keliling(){
        return  2*Math.PI*this.radius;
    }
}
