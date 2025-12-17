import java.util.Scanner;
public class Strongnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=n,a=0,i=0,b=1,x=0;
        for(int j=1;j<=n;j++){
        int k=j;
        while(k!=0){
            a=k%10;
            b=1;
            for(int l=1;l<=a;l++){
                b*=l;
            }
            x+=b;
            k/=10;
        }
        if(x==j){
            System.out.print(x+" ");
        }
        x=0;
        }
    }
}