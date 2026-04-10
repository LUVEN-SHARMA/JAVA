import java.util.*;
import java.util.stream.Stream;
public class main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> strm = list.stream();
        strm.forEach(n -> System.out.println(n + " "));        
    }
}
