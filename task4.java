import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class task4 {
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<>();
        h.add("red");
        h.add("green");
        h.add("yellow");
        h.add("blue");
        System.out.println("Orignal hash set"+h);
        ArrayList<String> a=new ArrayList<>(h);
        System.out.println(a);
    }
}
