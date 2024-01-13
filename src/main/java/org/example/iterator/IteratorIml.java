package org.example.iterator;

import java.util.ArrayList;
import java.util.List;

public class IteratorIml implements Iterator{
    List<User> list= new ArrayList<>();
    int size=0;
    int pos=0;
    IteratorIml(List<User> users)
    {
        list=users;
        size=users.size();
    }
    @Override
    public void next() {
        System.out.println(list.get(pos));
        pos++;
    }

    @Override
    public boolean hasNext() {
        return size!=pos;
    }
}
