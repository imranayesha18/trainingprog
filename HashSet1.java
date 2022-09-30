import java.util.HashSet;

public class HashSet1 {
    public static void main(String args[]){

        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(null);
        set.add(null);
        set.add(null);
        set.add(null);
        set.add(50);
        set.add(10);

        System.out.println(set);

    }
}
