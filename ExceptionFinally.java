public class ExceptionFinally {
    public static void main(String args[]){

        System.out.println("Statement 1");
        System.out.println("Statement 2");
        System.out.println("Statement 3");
        try{
            int i = 10/0;
        }catch (Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Statement from finally block");
        }
        System.out.println("Statement 4");
        System.out.println("Statement 5");
    }
}

