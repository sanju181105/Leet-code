import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int last = 0;
	    while(n!=0){
	    int temp = n%10;
	    if(temp==m){System.out.println("Occured");return;}
	    n/=10;
	    }
	    System.out.println("Not Occured");
	}
}
