import java.util.HashSet;

public class task2 {
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<>();
        h.add("red");
        h.add("green");
        h.add("yellow");
        h.add("blue");
        System.out.println("Orignal hash set"+h);
        System.out.println("checking the above set is empty"+h.isEmpty());
        h.removeAll(h);
        System.out.println("checking the above set is empty"+h.isEmpty());
    }
}
