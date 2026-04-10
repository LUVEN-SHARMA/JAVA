import java.util.*;
import java.util.stream.Stream;
public class main2 {
     public static void main(String[] args) {
        List<Integer> list = Arrays.asList(11,42,37,4,56,69);
        Stream<Integer> strm = list.stream();
        Stream<Integer> sorteddata = strm.sorted();
        sorteddata.forEach(n -> System.out.println(n + " "));
     }
}