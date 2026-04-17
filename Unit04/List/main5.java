// reverse sorting a list in java
import java.util.*;
public class main5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(169);
        list.add(207);
        list.add(40);
        System.out.println("Original list: " +list);
        Collections.sort(list);
        System.out.println("Sorted list: " +list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Reverse Sorted list: " +list);
    }
}