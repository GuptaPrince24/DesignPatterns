package org.example.iterator;

import java.util.ArrayList;
import java.util.List;

public class UserManagement {
    List<User> users= new ArrayList<>();
    public void add(User user)
    {
        users.add(user);
    }

    public Iterator iterate()
    {
        return new IteratorIml(users);
    }
}
