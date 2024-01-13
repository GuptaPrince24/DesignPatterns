package org.example.hashmap;

import java.util.ArrayList;
import java.util.List;

public class OurMap<K,V> {
   private List<MapNode<K,V>> bucket;
    private int capacity=5;
    private int size;

    public OurMap()
    {
        bucket = new ArrayList<>(capacity);
        for(int i=0;i<capacity;i++)
            bucket.add(null);
    }

    public V get(K key)
    {
       int index= getKeyBasedOnHash(key);
        MapNode<K, V> head = bucket.get(index);
        while(head!=null)
        {
            if(head.key.equals(key))
            {
                return head.value;
            }
            head=head.next;
        }
        return null;
    }
    public void remove(K key)
    {
        int index= getKeyBasedOnHash(key);
        MapNode<K, V> head = bucket.get(index);
        MapNode<K,V> prev = null;
        while(head!=null)
        {
            if(head.key.equals(key))
            {
                if(prev==null)
                {
                    bucket.set(index,head.next);

                }
                else
                    prev.next=head.next;
                head.next=null;
                size--;
                break;
            }
            prev=head;
            head=head.next;
        }
    }

    public void put(K key, V value)
    {
        int index= getKeyBasedOnHash(key);
        MapNode<K, V> head = bucket.get(index);
        while(head!=null)
        {
            if(head.key.equals(key))
            {
                head.value=value;
                return;
            }
            head=head.next;
        }
        head = bucket.get(index);
        MapNode<K, V> newEntry = new MapNode<>(key, value);
        newEntry.next=head;
        bucket.set(index, newEntry);
        size++;
        double lf= (1.0*size) / capacity;
        System.out.println("Load factor "+lf);
        if(lf>0.75)
            rehash();
    }
    private void rehash()
    {
        size=0;
        System.out.println("rehashing");
        capacity*=2;
        List<MapNode<K,V>> temp = bucket;
        bucket = new ArrayList<>(capacity);
        for(int i=0;i<capacity;i++)
            bucket.add(null);
        for (MapNode<K, V> node : temp) {
            while(node!=null){
                put(node.key, node.value);
                node = node.next;
            }

        }
    }

    private int getKeyBasedOnHash(K key) {
        return key.hashCode()%capacity;
    }


    private static class MapNode<K,V>
    {
        K key;
        V value;
        MapNode<K,V> next;
        MapNode(K key, V value)
        {
            this.key= key;
            this.value= value;
        }
    }
}
