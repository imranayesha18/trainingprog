public class New {
    public static void main(String args[]) {
        String name = "Ayesha";
        String rev = "";
        int len =name.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + name.charAt(i);
        }
        System.out.println("reverse of "+name+" is "+rev);
    }
}
