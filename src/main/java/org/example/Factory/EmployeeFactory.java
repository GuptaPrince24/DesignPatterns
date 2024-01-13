package org.example.Factory;

public class EmployeeFactory {
    static Employee employee;
    public EmployeeFactory()
    {
    }
    public static Employee createEmployee(String name)
    {
        if(name.equalsIgnoreCase("Android"))
        {
            employee= new AndroidDeveloper();
        }
        else if(name.equalsIgnoreCase("Web"))
            employee= new WebDeveloper();
        else
            employee=null;
        return employee;
    }
}
