import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int last = 0;
	    while(n!=0){
	    int temp = n%10;
	    last = temp;
	    n/=10;
	    }
	    if(last%2==0)System.out.println("Even number");
	    else System.out.println("Odd number");
	}
}
