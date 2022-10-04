import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMap {
        public static void main(String[] args) {
            Map<Integer,String> map=new LinkedHashMap<>();

            map.put(2,"imran");

            map.put(null, "ab");
            map.put(null,"xyz");
            map.put(3,"Divya");
            map.put(1,"Ayesha");

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

