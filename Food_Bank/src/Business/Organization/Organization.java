/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;

/**
 *
 * @author BHAVYA PRAKASH
 */
public class Organization {
    private String name;
    private String status;
    private EmployeeDirectory employeeDirectory;
    private int orgID;
    private static int count = 1;
    private OrganizationType organizationType;
    
     public enum OrganizationType{
        FundingOrganisation("Funding Organisation"), 
        Transportation("Transportation"),
        Warehouse ("Warehouse"),
        FoodInspectionDepartment("Food Inspection Department"),
        NGO("NGO"),
        Restaurant("Restaurant"),
        GroceryStores("Grocery Stores");
        
        private String value;

        private OrganizationType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        
    }
     public Organization(String name,OrganizationType type) {
        this.name = name;
        this.organizationType=type;
        this.status="Approval Pending";
        employeeDirectory = new EmployeeDirectory();
        orgID = count;
        ++count;
    }
    public Organization() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public int getOrgID() {
        return orgID;
    }

    public void setOrgID(int orgID) {
        this.orgID = orgID;
    }

    public OrganizationType getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(OrganizationType organizationType) {
        this.organizationType = organizationType;
    }
     
}
