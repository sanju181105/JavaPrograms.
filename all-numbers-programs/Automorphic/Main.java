import java.util.*;
public class Main{
    public  static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sq=n*n;
        int temp=n;
        int sum=1;
        while(temp>0){
            sum=sum*10;
            temp/=10;
        }
        if(sq%sum==n){
            System.out.print("Yes");
        }
        else{
            System.out.print("no");
        }
    }
}