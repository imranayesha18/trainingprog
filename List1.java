import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String args[]){

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(20);
        list.add(null);
      
        
        list.add(null);
        list.add(40);

        System.out.println(list);
    }
}
