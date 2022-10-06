public class EmpSwitch {
	 int id;  
	 String name, address;
	 String phone;
	 String type;
	    
	EmpSwitch(int i, String n, String a, String p,String t){
        this.id = i;
        this.name = n;
        this.address = a;
        this.phone = p;
        this.type=t;
    }
	public void testdm() {
		switch(type) {
		case "Hr":System.out.println("Inside Hr");
		break;
		case "admin":System.out.println("Inside admin");
		break;
		default:System.out.println("infra");
		break;
		}
	}


public static void main(String[] args) {
	   EmpSwitch obj = new EmpSwitch(101, "Ayesha", "Ranchi" ,"0123456789","Hr");
	   EmpSwitch obj1=new EmpSwitch(101, "Divya", "Karnataka" ,"9382629172","admin");
	   EmpSwitch obj2=new EmpSwitch(101, "Shree", "Ranchi" ,"0987654321","infra");
	   
	   //obj.testdm();
	   //obj1.testdm();
	   obj2.testdm();
}

}
