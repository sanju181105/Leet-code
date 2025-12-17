import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = n;
	    int nn = n%10;
	    while(n!=0){
	        int temp = n%10;
	        if(nn<temp){
	            nn=temp;
	        }n/=10;
	    }System.out.println(nn);
	}
}
