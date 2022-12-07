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
import java.time.LocalDate;
import java.time.Month;

public class Person {
    private String name;
    private LocalDate dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateofBirth) {
       this.dateOfBirth = dateofBirth; 
    }
    
    
}
