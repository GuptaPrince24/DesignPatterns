package org.example.AbstractFactory;

public class WebDeveloper implements Employee {
    public WebDeveloper()
    {
        System.out.println("Im a Web Developer");
    }
    @Override
    public int salary() {
        return 20000;
    }
}
