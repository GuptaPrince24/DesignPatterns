package org.example;

import org.example.AbstractFactory.AndroidDevFactory;
import org.example.AbstractFactory.Employee;
import org.example.AbstractFactory.EmployeeFactory;
import org.example.AbstractFactory.WebDevFactory;
import org.example.ObserverPattern.Subscriber;
import org.example.ObserverPattern.YoutubeChannel;
import org.example.adapter.Adaptor;
import org.example.adapter.AppleCharger;
import org.example.adapter.Dkharging;
import org.example.adapter.Iphone;
import org.example.iterator.Iterator;
import org.example.iterator.User;
import org.example.iterator.UserManagement;
import org.example.singleton.Samosa;

import java.io.*;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
//        Samosa samosa= Samosa.getSamosa();
//        System.out.println(samosa.hashCode());
//        ObjectOutputStream ois = new ObjectOutputStream(new FileOutputStream("demo.txt"));
//        ois.writeObject(samosa);
//        ObjectInputStream in = new ObjectInputStream(new FileInputStream("demo.txt"));
//        Samosa s = (Samosa)in.readObject();
//        System.out.println(s.hashCode());
//        Samosa clone = (Samosa)samosa.clone();
//        System.out.println(clone.hashCode());

        //factory pattern
//        Employee android = EmployeeFactory.createEmployee("Android");
//        System.out.println(android.salary());
//        Employee web = EmployeeFactory.createEmployee("Web");
//        System.out.println(web.salary());

        //Abstract factory pattern
//        Employee android = EmployeeFactory.createEmployee(new AndroidDevFactory());
//System.out.println(android.salary());
//        Employee web = EmployeeFactory.createEmployee(new WebDevFactory());
//        System.out.println(web.salary());

        //Observer Design Patern

//        YoutubeChannel channel = new YoutubeChannel();
//        Subscriber prince = new Subscriber("prince");
//        Subscriber priyanshu = new Subscriber("priyanshu");
//        channel.subscribe(prince);
//        channel.subscribe(priyanshu);
//        channel.newVedioUploaded();

        //Iterator design pattern

//        UserManagement um = new UserManagement();
//        um.add(new User("Prince","Indore","xyz@gmail.com"));
//        um.add(new User("PG","Indore","xyz@gmail.com"));
//        um.add(new User("Priyanshu","Gagorni","abc@gmail.com"));
//        Iterator iterate = um.iterate();
//        while(iterate.hasNext())
//            iterate.next();


        //Adaptor Design pattern

        AppleCharger charger =new Adaptor(new Dkharging());
        Iphone iphone = new Iphone(charger);
        iphone.charging();

    }
}