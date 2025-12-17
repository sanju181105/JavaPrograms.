import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=n,a=0,i=0,b=0;
        for(int j=1;j<=n;j++){
        int k=j;
        while(k!=0){
            a=k%10;
            i++;
            k/=10;
        }
        k=j;
        a=0;
        while(k!=0){
            a=k%10;
            b=b+(int)Math.pow(a,i);
            k/=10;
        }
        if(b==j){
            System.out.print(b+" ");
        }
        b=0;
        i=0;
        }
    }
}