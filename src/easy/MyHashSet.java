package easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Design a HashSet without using any built-in hash table libraries.
 * Implement MyHashSet class:
 * void add(key) Inserts the value key into the HashSet.
 * bool contains(key) Returns whether the value key exists
 *  in the HashSet or not.
 * void remove(key) Removes the value key in the HashSet.
 *  If key does not exist in the HashSet, do nothing.
 */
public class MyHashSet {
    private final int size = 100;
    private ArrayList<Integer>[] buckets;

    public MyHashSet() {
        buckets = new ArrayList[size];
        for(int i = 0; i< size; i++){
            buckets[i] = new ArrayList<>();
        }
    }

    private int hashFunction(int key){
        return key %size;
    }
    public void add(int key) {
        int index = hashFunction(key);
        ArrayList<Integer> bucket = buckets[index];
        if( !bucket.contains(key)){
            bucket.add(key) ;
        }
    }

    public void remove(int key) {
        int index = hashFunction(key);
        ArrayList<Integer> bucket = buckets[index];
        bucket.remove((Integer)key);
    }

    public boolean contains(int key) {
        int index = hashFunction(key);
        ArrayList<Integer> bucket = buckets[index];
        return bucket.contains(key);
    }
}
