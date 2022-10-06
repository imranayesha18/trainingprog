final public class Immutable {
    private final String address;
    private final String name;
    public int getAddress(){
        return address;
    }
    public String getName(){
        return name;
    }
    public Immutable(String a,String b){
        this.address=a;
        this.name=b;
    }

    public static void main(String[] args) {
        Immutable i=new Immutable("Bangalore","abc");
        System.out.println(i.name);
    }
}
