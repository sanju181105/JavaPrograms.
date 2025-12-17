import java.util.Scanner;

public class PerfectCube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i*i*i>n){
                break;
            }
            else{
                System.out.print(i*i*i);
                System.out.print(" ");
            }
        }
    }
}
