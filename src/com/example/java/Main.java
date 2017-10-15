package com.example.java;





public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Pete Stannis","ADMINISTRATOR",true, 27.00, 1," January, 1st 2005" );
        Employee emp2 = new Employee("Carl Barkley", "SALES",false, 21.00, 3," January, 21st 2005" );
        Employee emp3 = new Employee("Louis Gainsburg", "PRODUCTION",false, 22.00, 2," February, 21st 2005" );


        emp1.display();
        emp1.calculate(45);
        emp2.display();
        emp2.calculate(50);
        emp3.display();
        emp3.calculate(35);


    }








}
