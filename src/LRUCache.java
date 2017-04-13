import java.util.HashMap;

/**
 * Created by Amit on 17/03/17.
 */
public class LRUCache {
    int capacity;
    HashMap<Integer, Node> map = new HashMap<>();
    Node head = null;
    Node end = null;

    public LRUCache(int capacity){
        this.capacity = capacity;
    }

    public int get(int key){
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            setHead(node);
            return node.value;
        }
        return -1;
    }

    public void remove(Node n){
        if(n.prev != null){
            n.prev.next = n.next;
        }else {
            this.head = n;
        }

        if(n.next != null){
            n.next.prev = n.prev;
        }else {
            this.end = n;
        }
    }

    public void setHead(Node n){
        n.next = head;
        n.prev = null;
        if(head != null){
            head.prev = n;
        }
        head = n;
        if(end ==null)
            end = head;
    }

    public void set(int key, int value){
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.value = value;
            remove(node);
            setHead(node);
        }else {
            Node created = new Node(key, value);
            if(map.size() >= capacity){
                map.remove(end.key);
                remove(end);
                setHead(created);
            }else {
                setHead(created);
            }
            map.put(key,created);
        }
    }

}
