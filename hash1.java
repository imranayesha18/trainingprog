import java.util.*;

public class hash1 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();

        map.put(2,"imran");

        map.put(null,"ab");
        map.put(null,"xyz");
        map.put(1,"Ayesha");
        map.put(3,"Divya");
        map.put(3,"Divya");
        System.out.println(map);
        System.out.println(map.get(3));
        for(Map.Entry<Integer,String> m : map.entrySet())
        {
            if(m.getValue().equals("Ayesha"))
            {
                int key = m.getKey();
                System.out.println(key);
            }

        }
    }
}
