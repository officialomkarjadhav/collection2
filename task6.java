import java.util.HashSet;

public class task6 {
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<>();
        h.add("red");
        h.add("green");
        h.add("yellow");
        h.add("blue");
        System.out.println("Orignal hash set"+h);
        HashSet<String> h2=new HashSet<>();
        h2.add("red");
        h2.add("pink");
        h2.add("yellow");
        h2.add("blue");
        System.out.println("Orignal hash set2"+h2);
        h.retainAll(h2);
        System.out.println("hashset contant");
        System.out.println(h);
    }
}
