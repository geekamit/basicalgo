
import java.util.Map.Entry;
import java.util.TreeMap;

class Dog implements Comparable<Dog> {
String color;
Dog(String c) {
color = c;
}
public boolean equals(Object o) {
return ((Dog) o).color == this.color;
}
public int hashCode() {
return color.length();
}
public String toString(){
return color + " dog";
}


    public int compareTo(Dog o) {
        if(this.color.equals(o.color)){
            return 0;
        }else {
            return -1;
        }
    }
}

public class TestTreeMap {
public static void main(String[] args) {
Dog d1 = new Dog("red");
Dog d2 = new Dog("black");
Dog d3 = new Dog("white");
Dog d4 = new Dog("white");
TreeMap<Dog,Integer> treeMap = new TreeMap();
treeMap.put(d1, 10);
treeMap.put(d2, 15);
treeMap.put(d3, 5);
treeMap.put(d4, 20);

for (Entry<Dog,Integer> entry : treeMap.entrySet()) {
System.out.println(entry.getKey() + " - " + entry.getValue());
}
}
}