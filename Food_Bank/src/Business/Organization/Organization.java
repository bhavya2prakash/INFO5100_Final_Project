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
        employeeDirectory = new EmployeeDirectory();
        orgID = count;
        ++count;
    }
}
