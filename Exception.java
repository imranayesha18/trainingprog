public class Exptest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i=0;
        int [] arr=new int[5];
        System.out.println("statment 1");
        System.out.println("statment 2");
        System.out.println("statment 3");
        try {
            try{
                int j = 10/i;
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
            System.out.println(arr[6]);


        }
        catch(IndexOutOfBoundsException q) {
            System.out.println(q);
        }
        finally {
            System.out.println("finally");
        }

        System.out.println("statment 4");
        System.out.println("statment 5");

    }

}

