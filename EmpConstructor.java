public class EmpConstructor {
    int id;
    String name, address;
    String phone;
    String type;

    EmpConstructor(int i, String n, String a, String p,String t){
        this.id = i;
        this.name = n;
        this.address = a;
        this.phone = p;
        this.type=t;
    }
    public void testdm() {
        if(type.equals("Hr"))
        {
            System.out.println("Inside Hr");

        }
        else if(type.equals("admin"))
        {
            System.out.println("Inside admin");
        }
        else
        {
            System.out.println("infra");
        }
    }


    public void display(int i){
        System.out.println("Name:"+id+"\nphone:"+phone);
    }


    public void display(){
        System.out.println("\nName:"+name+"\nAddress:"+address);
    }


    public static void main(String[] args) {
        EmpConstructor obj = new EmpConstructor(101, "Ayesha", "Ranchi" ,"0123456789","Hr");
        EmpConstructor obj1=new EmpConstructor(101, "Divya", "KARNATAKA" ,"7904738291","admin");
        EmpConstructor obj2=new EmpConstructor(101, "Shree", "" ,"0987654332","infra");

        obj.testdm();
        obj1.testdm();
        obj2.testdm();
    }

}

