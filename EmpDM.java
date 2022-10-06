public class EmpDM {
    int id;
    String name;
    String type;
    public EmpDM(int a,  String d,String type)
    {
        this.id = a;
        this.name = d;
        this.type = type;
    }

    void DM(){
        if(type.equals("HR")){
            System.out.println("9 to 6");
        }
        else if(type.equals("Fresher")){
            System.out.println("10 to 7");
        }
        else{
            System.out.println("9 to 5");
        }
    }

    class New {

        public static void main(String args[]) {

            EmpDM o1 = new EmpDM(12, "abc", "HR");
            EmpDM o2 = new EmpDM(13, "xyz", "Fresher");
            EmpDM o3 = new EmpDM(14, "qwe", "infra");
            o1.DM();
            o2.DM();
            o3.DM();
        }
    }
}

