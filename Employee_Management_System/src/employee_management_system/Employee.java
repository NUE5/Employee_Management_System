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
public class Employee {
     protected int ID;
    protected String FirstName;
    protected String SurName;
    protected String Gender;
    protected String Email;
    protected String DOB;
    protected int Age;
    protected String Password;
    protected double Salary;
  

    public Employee() {
    }

 
    public Employee(int ID, String FirstName, String SurName, String Gender, String Email, int Age, double Salary, String Password,String DOB) {
        this.ID = ID;
        this.FirstName = FirstName;
        this.SurName = SurName;
        this.Gender = Gender;
        this.Email = Email;
        this.Age = Age;
        this.Salary = Salary;
        this.Password=Password;
        this.DOB=DOB;
    }

    
    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getSurName() {
        return SurName;
    }

    public String getGender() {
        return Gender;
    }

    public String getEmail() {
        return Email;
    }

   

    public int getAge() {
        return Age;
    }

    public String getPassword() {
        return Password;
    }

    public double getSalary() {
        return Salary;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setSurName(String SurName) {
        this.SurName = SurName;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

   

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

  


}
