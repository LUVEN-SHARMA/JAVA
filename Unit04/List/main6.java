// reverse sorting a list in java
import java.util.*;
public class main6 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(169);
        list.add(207);
        list.add(40);
        System.out.println("Original list: " +list);
        list.sort(Comparator.naturalOrder());
        System.out.println("Sorted list: " +list);
        list.sort(Comparator.reverseOrder());
        System.out.println("Reverse Sorted list: " +list);
    }
}