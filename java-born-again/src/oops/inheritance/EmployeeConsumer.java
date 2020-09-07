package oops.inheritance;

import oops.inheritance.Employee;

public class EmployeeConsumer {

    public static void printValues(Employee employee){
        System.out.println("Printing " + employee.getEmpId());
        employee.setEmpId(222222);
    }


    public static void main(String[] args) {

        Employee firstEmployee = new Employee(776677);
        Employee secondEmployee = new Employee();
        secondEmployee.setEmpId(321123);
        secondEmployee.setEmployed(true);

        Employee thirdEmployee = new Employee();
        Employee fourthEmployee = new Employee();

        Employee fifthEmployee = new Employee();
        fifthEmployee.setEmpId(9988998);
        fifthEmployee.setLocation("cbe");
        System.out.println(fifthEmployee.getEmpId());
        System.out.println(fifthEmployee.getLocation());

        int theValuePassedInSetterMethod = secondEmployee.getEmpId();
        System.out.println(theValuePassedInSetterMethod);

        System.out.println(fifthEmployee.isEmployed());


        // variable to hold single cell value
        int empId = 312132;

        //variable to hold single column data
        int[] empIds = new int[2];
        empIds[0] = 321123;
        empIds[1] = 998898;

        //variable to hold a table of data
        Employee[] employees = new Employee[2];
        employees[0] = secondEmployee;
        employees[1] = fifthEmployee;

        Employee takenOutFromArray = employees[0];
        takenOutFromArray.setEmpId(121212);
        System.out.println("---------------------");
        // Example depicting object reference change and its impact
        System.out.println(secondEmployee.getEmpId());



        printValues(firstEmployee);
        System.out.println("Printing " + firstEmployee.getEmpId());
        Employee finalEmployee = firstEmployee;
    }
}
