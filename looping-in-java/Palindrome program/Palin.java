import java.util.*;
public class Palin{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=n;
        int rev=0;
        int digit=0;
        while(n>0){
            digit=n%10;
            rev=rev*10+digit;
            n/=10;
        }
        if(x==rev){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}