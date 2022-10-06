public class EmpMethodoverriding {
    int id;
    String name, address;
    String phone;
    String type;

    public void display(int i){
        System.out.println("Name:"+id+"\nphone:"+phone);
    }


}
class Hr extends EmpMethodoverriding {

    public void display(int i){
        System.out.println("\nName:"+"Dhiraj"+"\nAddress:"+"Gaya");
    }
}


class Demo{
    public static void main(String args[]){

        EmpMethodoverriding obj=new Hr();
        obj.display(2);
    }
}
