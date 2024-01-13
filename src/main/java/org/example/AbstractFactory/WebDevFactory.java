package org.example.AbstractFactory;

public class WebDevFactory extends EmployeeAbstractFactory{
    @Override
    public Employee getEmployee() {
        return new WebDeveloper();
    }
}
