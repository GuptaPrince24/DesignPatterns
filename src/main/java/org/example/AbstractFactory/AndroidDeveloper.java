package org.example.AbstractFactory;



public class AndroidDeveloper implements Employee {
    public AndroidDeveloper()
    {
        System.out.println("Im an android developer");
    }
    @Override
    public int salary() {
        return 10000;
    }
}
