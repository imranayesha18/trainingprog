public class ExceptionTryCatch{
    public static void main(String args[]){
        System.out.println("Statement 1");
        System.out.println("Statement 2");
        System.out.println("Statement 3");
        int[] arr = new int[5];
        try{
            try{
                int i = 10/0;
            }
            catch (ArithmeticException e) {
                System.out.println(e);
            }
            System.out.println(arr[6]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("Statement 4");
        System.out.println("Statement 5");
    }
}
