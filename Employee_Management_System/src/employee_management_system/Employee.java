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
  
    protected String FirstName;
    protected String SurName;
    protected String Gender;
    protected String Email;
    protected int Age;
    protected String Password;
    protected float Salary;
  

    public Employee() {
    }

 
    public Employee( String FirstName, String SurName, String Gender, String Email, int Age, String Password) {
      
        this.FirstName = FirstName;
        this.SurName = SurName;
        this.Gender = Gender;
        this.Email = Email;
        this.Age = Age;
        this.Password=Password;
       
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

    public void setSalary(float Salary) {
        this.Salary = Salary;
    }

  


}
