package com.example.crudoperation.dto;
import org.hibernate.annotations.Type;
import javax.persistence.Column;
import java.util.ArrayList;
public class EmployeeDTO {
    private int  employeeID;
    private String name;
    private String address;
    private double salary;
    private ArrayList contactNumber;
    private String nic;
    private boolean activeState;

    public EmployeeDTO() {
    }

    public EmployeeDTO(int employeeID, String name, String address, double salary, ArrayList contactNumber, String nic, boolean activeState) {
        this.employeeID = employeeID;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.contactNumber = contactNumber;
        this.nic = nic;
        this.activeState = activeState;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public ArrayList getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(ArrayList contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public boolean isActiveState() {
        return activeState;
    }

    public void setActiveState(boolean activeState) {
        this.activeState = activeState;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "employeeID=" + employeeID +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", contactNumber=" + contactNumber +
                ", nic='" + nic + '\'' +
                ", activeState=" + activeState +
                '}';
    }
}
