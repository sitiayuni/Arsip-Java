/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuisdiagram;

import java.time.LocalDate;

/**
 *
 * @author LENOVO
 */
public class Student extends Person{
    private String npm;
    private String programStudi;

    public Student(String npm, String programStudi, String name, LocalDate dateOfBirth) {
        super(name, dateOfBirth);
        this.npm = npm;
        this.programStudi = programStudi;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }
    
    
    
    
    
    
    
    
    
}
