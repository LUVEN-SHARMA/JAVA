// sorting a list in java
import java.util.*;
public class main4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(169);
        list.add(207);
        list.add(40);
        System.out.println("Original list: " +list);
        Collections.sort(list);
        System.out.println("Sorted list: " +list);
    }
}
