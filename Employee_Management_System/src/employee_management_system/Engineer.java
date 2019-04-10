/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_management_system;

/**
 *
 * @author nanon
 */
public class Engineer extends Employee{
    
    private int WorkingHors;
    private String position;
    private float taxRate;
    private float payRate;


    public Engineer( String FirstName, String SurName, String Gender, String Email, int Age, String Password, int WorkingHours,String role) {
        super( FirstName, SurName, Gender, Email, Age,  Password);
        this.WorkingHors=WorkingHours;
        this.position=position;

    }

    public int getWorkingHors() {
        return WorkingHors;
    }

    public void setWorkingHors(int WorkingHors) {
        this.WorkingHors = WorkingHors;
    }

    
}

