package com.example.java;

public class Employee {
    String name;
    String position;
    Boolean salary;
    Double payrate;
    int shift;
    String startdate;

    public Employee(String name, String position, Boolean salary, Double payrate, int shift, String startdate) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.payrate = payrate;
        this.shift = shift;
        this.startdate = startdate;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public Boolean getSalary() {
        return salary;
    }

    public Double getPayrate() {
        return payrate;
    }

    public int getShift() {
        return shift;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(Boolean salary) {
        this.salary = salary;
    }

    public void setPayrate(Double payrate) {
        this.payrate = payrate;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }


    public void display() {
        System.out.println(this.name);
        System.out.println("     current position is " +this.position+ ". Salary is "+ this.salary + ". Shift is "+ this.shift);


    }
    public double calculate(double hoursIn){

        double endPayRate;
        double weekEarnings;

        endPayRate=this.payrate;

        if (this.shift==2) {
            endPayRate=endPayRate+(endPayRate*.05);
        }
        if (this.shift==3) {
            endPayRate=endPayRate+(endPayRate*.10);
        }

        weekEarnings=hoursIn*endPayRate;

        System.out.println("     "+ this.name + " has earned "+ weekEarnings+ " this week.");
        System.out.println("");
        System.out.println("");


        return weekEarnings;

    }
}
