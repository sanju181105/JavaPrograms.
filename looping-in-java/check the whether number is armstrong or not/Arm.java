import java.util.*;
public class Arm {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int digit=0;
		int sum=0;
		int x=n;
		while(n>0) {
			digit=n%10;
			sum+=digit*digit*digit;
			n/=10;
		}
		if(sum==x) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("not");
		}
	}
}