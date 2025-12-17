import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int dig = 0,dig1 = 0;
	    while(n!=0){
	        int temp = n%10;
	        if(temp%2==0)dig++;
	        else dig1++;
	        n/=10;
	    }
	    if(dig>0 && dig1>0)
	        System.out.println("Mixed ");
	    else if(dig>0)
	        System.out.println("Even ");
	    else
	        System.out.println("Odd ");
	}
}
