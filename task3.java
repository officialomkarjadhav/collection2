import java.util.HashSet;

class task3 {
public static void main(String[] args) {
    HashSet<String> h=new HashSet<>();
    h.add("red");
    h.add("green");
    h.add("yellow");
    h.add("blue");
    System.out.println("Orignal hash set"+h);
    String [] s=new String[h.size()];
    h.toArray(s);
    for(String e:s){
        System.out.println(e);
    }
}
}