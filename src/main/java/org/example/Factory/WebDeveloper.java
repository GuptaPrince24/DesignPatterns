package org.example.Factory;

public class WebDeveloper implements Employee{
    public WebDeveloper()
    {
        System.out.println("Im a Web Developer");
    }
    @Override
    public int salary() {
        return 20000;
    }
}
