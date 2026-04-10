import java.util.*;
import java.util.stream.Stream;
public class main1 {
     public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> strm = list.stream();
        long len = strm.count();
        System.out.println(len);
     }
    
}
