import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int nn = n;
	    int m = 0;
	    int sum = 0;
	    while(n!=0){
	        int temp = n%10;
	        m+=(int)Math.pow(temp,2);
	        n/=10;
	    }n = nn;
	    while(n!=0){
	        int temp = n%10;
	        sum+=(int)Math.pow(temp,3);
	        n/=10;
	    }
	    System.out.print("Square : "+m+"\nCube : "+sum);
	}
}
