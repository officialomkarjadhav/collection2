import java.util.HashSet;
import java.util.Iterator;

class task1{
    public static void main(String[] args) {
        HashSet<String> h=new HashSet<>();
        h.add("red");
        h.add("green");
        h.add("yellow");
        h.add("blue");
        
        Iterator <String> i=h.iterator();
           while(i.hasNext()){
            System.out.println(i.next());
           }
    }
}
