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
    private String Grade;
    private double taxRate;
    private double payRate;
   

    public Engineer(int ID, String FirstName, String SurName, String Gender, String Email, int Age, double Salary, String Password, String DOB,int WorkingHours,String Grade) {
        super(ID, FirstName, SurName, Gender, Email, Age, Salary, Password, DOB);
        this.WorkingHors=WorkingHours;
        this.Grade=Grade;
    }

    public int getWorkingHors() {
        return WorkingHors;
    }

    public void setWorkingHors(int WorkingHors) {
        this.WorkingHors = WorkingHors;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    
    public void SetSalary(String Grade,int WorkingHours)
    {
        switch(Grade)
        {
            case "Manager":
                    {
                       taxRate=0.1;
                       payRate=20;
                       Salary=payRate*WorkingHours-(payRate*WorkingHours*taxRate);
                        break;
                    }
                     case "Team leader":
                    {
                       taxRate=0.1;
                       payRate=20;
                       Salary=payRate*WorkingHours-(payRate*WorkingHours*taxRate);
                        break;
                    }
                     case "Team member":
                    {
                       taxRate=0.1;
                       payRate=20;
                       Salary=payRate*WorkingHours-(payRate*WorkingHours*taxRate);
                        break;
                    }
        }
    }
    
}

