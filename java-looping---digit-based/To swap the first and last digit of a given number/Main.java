import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int temp = n;
	    int digit = 0;
	    int last = n%10;
	    while(temp!=0){
	        digit++;
	        temp/=10;
	    }temp = n;
	    while(temp>9){
	        temp/=10;
	    }
	    int first = temp;
	    int middle =n - first*(int)Math.pow(10,digit-1) -last;
	    middle =last*(int)Math.pow(10,digit-1) +middle+first;
	    System.out.println(middle);
	}
}
