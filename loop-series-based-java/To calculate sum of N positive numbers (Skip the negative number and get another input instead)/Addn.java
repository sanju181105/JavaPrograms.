import java.util.*;
public class Addn
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=1;
		while(true){
		    int n=sc.nextInt();
		    if(n<0){
		        break;
		    }else
		    x+=n;
		}
		System.out.println(x);
	}
}