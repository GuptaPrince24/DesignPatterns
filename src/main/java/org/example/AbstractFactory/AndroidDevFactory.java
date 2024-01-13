package org.example.AbstractFactory;

public class AndroidDevFactory extends EmployeeAbstractFactory{
    @Override
    public Employee getEmployee() {
        return new AndroidDeveloper();
    }
}
