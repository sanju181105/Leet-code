import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int count = 0;
	    int nn = n%10;
	    while(n!=0){
	    int temp = n%10;
	    if(nn>temp){
	        System.out.println("Not Decending");
	        return;
	    }nn=temp;
	    n/=10;
	    }
	    System.out.println("Decending");
	}
}
