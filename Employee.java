package org.example.Day35PracticePrablem;

import java.util.Date;

public class Employee {
   int empID;
    String department, adress,  empName, phoneNumber,city, contry;
    char gen;
    float basicPay;
    Date startDate;

    @Override
    public String toString() {
        return "Employee{" +
                "department='" + department + '\'' +
                ", adress='" + adress + '\'' +
                ", empID='" + empID + '\'' +
                ", empName='" + empName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", city='" + city + '\'' +
                ", contry='" + contry + '\'' +
                ", gen=" + gen +
                ", basicPay=" + basicPay +
                ", startDate=" + startDate +
                '}';
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContry() {
        return contry;
    }

    public void setContry(String contry) {
        this.contry = contry;
    }

    public char getGen() {
        return gen;
    }



    public float getBasicPay() {
        return basicPay;
    }

    public void setBasicPay(float basicPay) {
        this.basicPay = basicPay;
    }

    public java.sql.Date getStartDate() {
        return (java.sql.Date) startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
