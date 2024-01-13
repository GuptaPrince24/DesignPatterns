package org.example.singleton;

import java.io.Serializable;

public class Samosa implements Serializable, Cloneable {

    private static Samosa samosa;
    private Samosa(){
        if(samosa==null)
            samosa= new Samosa();
        else
            System.out.println("object is already created");
    }

    public static Samosa getSamosa()
    {
        if(samosa==null)
        {
            synchronized (Samosa.class) {
                if(samosa==null)
                 samosa = new Samosa();
            }
        }
        return samosa;
    }
    public Object readResolve()
    {
        return samosa;
    }
    public Object clone() throws CloneNotSupportedException {
        return samosa;
    }

    @Override
    public String toString() {
        return "samosa";
    }
}
