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
public class Grade {
    private float taxRate;
    private int payRate;
    private String Position;
    private float Salary;
    public Grade(float taxRate, int payRate, String Position) {
        this.taxRate = taxRate;
        this.payRate = payRate;
        this.Position = Position;
    }

    public Grade(String Position) {
        this.Position = Position;
    }

   
    public float getTaxRate() {
        return taxRate;
    }

    public int getPayRate() {
        return payRate;
    }

    public String getPosition() {
        return Position;
    }
       
    public float calculate_salary(String pos,int WorkingHours)
    {
        switch(pos)
        {
            case "Manager":
                    {
                       taxRate=0.1f;
                       payRate=20;
                       Salary=payRate*WorkingHours-(payRate*WorkingHours*taxRate);
                        break;
                    }
                     case "Team Leader":
                    {
                       taxRate=0.1f;
                       payRate=20;
                       Salary=payRate*WorkingHours-(payRate*WorkingHours*taxRate);
                        break;
                    }
                     case "Software Engineer":
                    {
                       taxRate=0.1f;
                       payRate=20;
                       Salary=payRate*WorkingHours-(payRate*WorkingHours*taxRate);
                        break;
                    }
                     case "Software Developer":
                    {
                       taxRate=0.1f;
                       payRate=20;
                       Salary=payRate*WorkingHours-(payRate*WorkingHours*taxRate);
                        break;
                    }
                     case "Security Engineer":
                    {
                       taxRate=0.1f;
                       payRate=20;
                       Salary=payRate*WorkingHours-(payRate*WorkingHours*taxRate);
                        break;
                    }
                     case "Web Developer":
                    {
                       taxRate=0.1f;
                       payRate=20;
                       Salary=payRate*WorkingHours-(payRate*WorkingHours*taxRate);
                        break;
                    }
                     case "Tester":
                    {
                       taxRate=0.1f;
                       payRate=20;
                       Salary=payRate*WorkingHours-(payRate*WorkingHours*taxRate);
                        break;
                    }
        }
       return Salary;
    }

    public float getSalary() {
        return Salary;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }
    
}
