package org.example.AbstractFactory;


public class EmployeeFactory {
    static Employee employee;
    public EmployeeFactory()
    {
    }
    public static Employee createEmployee(EmployeeAbstractFactory employeeAbstractFactory)
    {
        return employeeAbstractFactory.getEmployee();
    }
}
