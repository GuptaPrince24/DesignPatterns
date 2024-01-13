package org.example.hashmap;

public class Main {
    public static  void main(String args[])
    {
        OurMap<Integer, String> map = new OurMap<>();
        map.put(1,"a");
        map.put(6,"prince");
        map.put(6,"shruti");
        map.put(5,"priyanshu");
        System.out.println(map.get(1));
        map.remove(1);
        System.out.println(map.get(1));
        System.out.println(map.get(6));
        System.out.println(map.get(7));
    }
}
