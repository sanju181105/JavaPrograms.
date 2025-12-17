import java.util.*;
public class Square{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int root=(int)Math.sqrt(a);
        if(root*root==a){
            System.out.println("perfect");
        }
        else{
            System.out.println("not");
        }
    }
}