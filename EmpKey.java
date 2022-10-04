import java.util.HashMap;
import java.util.Map;

public class EmpKey {
    int id;
    String name;
    EmpKey(int i, String n)
    {
        this.id = i;
        this.name = n;

    }

    @Override
    public String toString() {
        return id+" : "+name;

    }
}
class emp{
    public static void main(String[] args) {
        EmpKey obj1 = new EmpKey(1,"Ayesha");
        EmpKey obj2 = new EmpKey(2,"imran");
        EmpKey obj3 = new EmpKey(3,"Divya");
        EmpKey obj4 = new EmpKey(4,"Shree");
        EmpKey obj5 = new EmpKey(5,"Basava");
        EmpKey obj6 = new EmpKey(1,"Ayesha");
        Map<EmpKey,Integer> map=new HashMap();
        map.put(obj1, obj1.id);
        map.put(obj6,obj6.id);
        map.put(obj2, obj2.id);
        map.put(obj3, obj3.id);
        map.put(obj4, obj4.id);
        map.put(obj5, obj5.id);

        System.out.println(map);


    }
}

