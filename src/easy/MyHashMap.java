package easy;

class Node{
    int key ;
    int value;
    Node next;

    public Node(int key, int value){
        this.key = key;
        this.value = value;
    }
}
public class MyHashMap {

    private Node[] buckets;
    public MyHashMap() {
        buckets = new Node[1000];
        for(int i = 0; i< 1000; i++){
            buckets[i] = new Node(-1,-1);
        }
    }

    private int hash(int key){
        return key % 1000;
    }
    public void put(int key, int value) {
        int idx = hash(key);
        Node prev = buckets[idx];
        while( prev.next != null){
            if(prev.next.key == key){
                prev.next.value = value;
                return;
            }
            prev = prev.next;
        }
        prev.next = new Node(key, value);
    }

    public int get(int key) {
        int idx = hash(key);
        Node prev = buckets[idx].next;
        while(prev !=null){
            if(prev.key == key) return prev.value;
            prev = prev.next;
        }
        return -1;
    }

    public void remove(int key) {
        int idx = hash(key);
        Node prev = buckets[idx];
        while( prev.next != null){
            if(prev.next.key == key){
                prev.next = prev.next.next;
                return;
            }
            prev = prev.next;
        }
    }
}
