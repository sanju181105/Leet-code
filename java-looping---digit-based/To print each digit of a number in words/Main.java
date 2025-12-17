import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int nn = n;
	    int sum = 0;
	     if (n == 0) {
            System.out.print("Zero");
            return;
        }
	    while(n!=0){
	        int temp = n%10;
	        sum = sum*10+temp;
	        n/=10;
	    }n = nn;
	    while(sum!=0){
	        int temp = sum%10;
	        switch(temp){
	            case 0:System.out.print("Zero ");break;
	            case 1:System.out.print("One ");break;
	            case 2:System.out.print("two ");break;
	            case 3:System.out.print("three ");break;
	            case 4:System.out.print("Four ");break;
	            case 5:System.out.print("Five ");break;
	            case 6:System.out.print("Six ");break;
	            case 7:System.out.print("Seven ");break;
	            case 8:System.out.print("Eight ");break;
	            case 9:System.out.print("Nine ");break;
	        }
	        sum/=10;
	    }
	    
	}
}
