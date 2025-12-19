import java.util.*;
public class Main{
    public  static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
       // int temp=n;
        int sq=n*n;
        while(sq>0){
            sum+=sq%10;
            sq/=10;
        }
        if(sum==n){
            System.out.print("Neon");
        }
        else{
            System.out.print("No");
        }
    }
}
        