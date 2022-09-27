import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Regex{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Hi, Choose  one of the options");
        System.out.println(" 1.Enter mail \n 2.Enter id \n 3.Enter phone \n 4.Enter Add");
        String s = sc.next();
        String reg_email="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        String reg_id="^AMT+[0-9]+$";
        String reg_ph="^91[0-9]{10}+$";
        String reg_add="^[a-zA-Z0-9+_.-]+[1-9][0-9]{5}+$";
        switch (s){
            case "1":
                System.out.println("enter your mail");
                String e=sc.next();
                if(e.matches(reg_email)){
                    System.out.println("valid email");
                }
                else {
                    System.out.println("invalid email");
                }
                break;
            case "2":
                System.out.println("enter employee id");
                String id= sc.next();
                if(id.matches(reg_id)){
                    System.out.println("valid id");
                }
                else{
                    System.out.println("invalid id");
                }
                break;
            case "3":
                System.out.println("enter your phone number");
                String ph= sc.next();
                if(ph.matches(reg_ph)){
                    System.out.println("valid phone number");
                }
                else{
                    System.out.println("invalid phone number");
                }
                break;
            case "4":{
                System.out.println("please enter address");
                String add=sc.next();
                if(add.matches(reg_add)){
                    System.out.println("Entered address is correct");
                }
                else {
                    System.out.println("enter correct address");
                }
            }
            break;
            default:{
                System.out.println("invalid option");
            }

        }

    }
}
