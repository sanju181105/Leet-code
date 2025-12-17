import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int dig = 0,dig1 = 0;
	    while(n!=0){
	        int temp = n%10;
	        if(temp%2==0)dig+=temp;
	        else dig1+=temp;
	        n/=10;
	    }n = dig-dig1;
	    System.out.println(n>0?n:-n);
	}
}
