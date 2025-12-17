import java.util.*;
public class Buzz{
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%7==0||a%10==7)
        {
            System.out.print("Buzz number");
        }
        else{
            System.out.print("Not");
        }
    }
}