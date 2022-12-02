/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;

/**
 *
 * @author BHAVYA PRAKASH
 */
public class Employee {
    private String name;
    private int empId;
    private static int count = 1;

    public Employee() {
        empId = count;
        count++;
    }

    public int getempId() {
        return empId;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }
}
