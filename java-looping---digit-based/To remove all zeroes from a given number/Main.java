import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = 0;
	    int sum = 0;
	    while(n!=0){
	        int temp = n%10;
	        sum = sum*10+temp;
	        n/=10;
	    }
	    while(sum!=0){
	        int temp = sum%10;
	        if(temp!=0)m = m*10+temp;
	        sum/=10;
	    }
	    System.out.println(m);
	}
}
