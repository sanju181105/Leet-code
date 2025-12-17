import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int count = 0;
	    while(n!=0){
	    int temp = n%10;
	    if(temp==m)count++;
	    n/=10;
	    }
	    System.out.println(count);
	}
}
