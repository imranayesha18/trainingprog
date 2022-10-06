import java.util.ArrayList;

public class EmpContinue {
    int id;
    String name, address;
    String phone;
    String type;

    EmpContinue(int i, String n, String a, String p,String t){
        this.id = i;
        this.name = n;
        this.address = a;
        this.phone = p;
        this.type=t;
    }
    public void testdm() {
        System.out.println("ID:"+id+"\nphone:"+phone);
    }
    public static void main(String[] args) {
        EmpContinue e1=  new EmpContinue(1, "ABC","xy","9123232425","aaa");
        EmpContinue e2=  new EmpContinue(2, "ABC2","xyz","9122223344","bbb");
        EmpContinue e3=  new EmpContinue(3, "AB3C","yz","9133344488","ccc");
        EmpContinue e4=  new EmpContinue(4, "ABC55","xz","9144445555","ddd");
        EmpContinue e5=  new EmpContinue(5, "AB66C","eee","9144455566","eee");
        EmpContinue e6=  new EmpContinue(6, "ABC7","ece","9123244546","fff");
        EmpContinue e7=  new EmpContinue(7, "AB88C","efe","9123256798","ggg");
        EmpContinue e8=  new EmpContinue(8, "ABC","eve","9124346587","hhh");


        ArrayList<EmpContinue> empArr = new ArrayList<>();
        empArr.add(e1);
        empArr.add(e2);
        empArr.add(e3);
        empArr.add(e4);
        empArr.add(e5);
        empArr.add(e6);
        empArr.add(e7);
        empArr.add(e8);

        for (EmpContinue emp : empArr)
        {
            if(emp.id%2 !=0)
                continue;
            System.out.println(emp.id +" " + emp.name +" "+ emp.address +" " +emp.phone +" " + emp.type );
        }



    }
}

