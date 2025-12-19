import java.util.*;
public class Main{
    public  static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       // int temp=n;
        while(n>9){
            int sum=0;
            while(n>0){
            sum+=n%10;
            n/=10;
        }
        n=sum;
        }
    if(n==1){
        System.out.print("Magic");
    }
    else{
        System.out.print("No");
    }
}
}

