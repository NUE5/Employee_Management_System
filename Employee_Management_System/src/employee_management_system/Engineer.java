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
    private Grade g;

    public Engineer( String FirstName, String SurName, String Gender, String Email, int Age, String Password, int WorkingHours,String position,double Salary) {
        super( FirstName, SurName, Gender, Email, Age,  Password);
        this.WorkingHors=WorkingHours;
        this.position=position;
        this.Salary=Salary;
    }

    public String getFirstName() {
        return FirstName;
    }

    public int getWorkingHors() {
        return WorkingHors;
    }

    public void setWorkingHors(int WorkingHors) {
        this.WorkingHors = WorkingHors;
    }

    public String getPosition() {
        return position;
    }

    public void setSalary(float Salary) {
        Salary=g.calculate_salary(position, WorkingHors);
    }

    public double getSalary() {
        return Salary;
    }

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String SurName) {
        this.SurName = SurName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    
}

