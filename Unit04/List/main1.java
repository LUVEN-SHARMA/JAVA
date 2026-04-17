import java.util.ArrayList;
import java.util.List;
public class main1 {
    public static void main(String[] args) {
       List<Integer> list = new ArrayList<>();
       Integer a[] = {10, 20, 30};
       for(Integer i : a) {
       list.add(i);
    }
    System.out.println(list);
}
}