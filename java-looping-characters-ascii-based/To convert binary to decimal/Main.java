import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = 0;
	    int count = 0;
	    while(n!=0){
	        int temp = n%10;
	        m += temp*Math.pow(2,count);
	        count++;
	        n/=10;
	    }System.out.println(m);
	}
}
