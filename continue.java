public class Employee {
     int id;  
     String name, address;
     String phone;
     String type;

    Employee(int i, String n, String a, String p,String t){
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
            Employee e1=  new Employee(1, "ABC","xy","9123232425","aaa");
            Employee e2=  new Employee(2, "ABC2","xyz","9122223344","bbb");
            Employee e3=  new Employee(3, "AB3C","yz","9133344488","ccc");
            Employee e4=  new Employee(4, "ABC55","xz","9144445555","ddd");
            Employee e5=  new Employee(5, "AB66C","eee","9144455566","eee");
            Employee e6=  new Employee(6, "ABC7","ece","9123244546","fff");
            Employee e7=  new Employee(7, "AB88C","efe","9123256798","ggg");
            Employee e8=  new Employee(8, "ABC","eve","9124346587","hhh");


            ArrayList<Employee> empArr = new ArrayList<>();
            empArr.add(e1);
            empArr.add(e2);
            empArr.add(e3);
            empArr.add(e4);
            empArr.add(e5);
            empArr.add(e6);
            empArr.add(e7);
            empArr.add(e8);

            for (Employee emp : empArr)
            {
                if(emp.id%2 !=0)
                    continue;
                System.out.println(emp.id +" " + emp.name +" "+ emp.address +" " +emp.phone +" " + emp.type );
            }



        }
        }
