/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;

import Business.Organization.Organization;
import java.util.ArrayList;

/**
 *
 * @author BHAVYA PRAKASH
 */
public class EmployeeDirectory {
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee addEmployee(String name,Organization organization){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setOrganization(organization);
        employeeList.add(employee);
        return employee;
    }
}
