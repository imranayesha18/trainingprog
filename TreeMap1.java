public class TreeMap1 {
        public static void main(String[] args) {
            Map<Integer,String> map=new TreeMap<>();
            map.put(3,"Ayesha");
            map.put(2,"imran");
            map.put(1,"Divya");
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

