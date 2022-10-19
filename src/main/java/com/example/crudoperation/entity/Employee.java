package com.example.crudoperation.entity;

import com.vladmihalcea.hibernate.type.json.JsonType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "employee")
@TypeDefs({
        @TypeDef(name = "json" , typeClass = JsonType.class)
})

public class Employee {

    @Id
    @Column(name = "employee_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int  employeeID;

    @Column(name = "employee_name", length = 200, nullable = true)
    private String name;

    @Column(name = "address", length = 250)
    private String address;

    @Column(name = "salary", length = 45)
    private double salary;

    @Type(type = "json")
    @Column(name = "contact_numbers", columnDefinition = "json")
    private ArrayList contactNumber;

    @Column(name = "nic", length = 20)
    private String nic;

    @Column(name = "active_state", columnDefinition = "TINYINT default 1")
    private boolean activeState;

    public Employee() {
    }

    public Employee(int employeeID, String name, String address, double salary, ArrayList contactNumber, String nic, boolean activeState) {
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
        return "Employee{" +
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
