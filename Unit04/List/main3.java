// removing element from list using index
import java.util.*;
public class main3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.remove(1);
        System.out.println("After removing element at index 1: " + list);
    }
}
