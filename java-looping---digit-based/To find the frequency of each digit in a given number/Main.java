import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = n;
	    int[] freq = new int[10];
	    while(n!=0){
	        int temp = n%10;
	        freq[temp]++;
	        n/=10;
	    }
	     for(int i=0;i<10;i++){
	         if(freq[i]>0){
	             System.out.println("count "+i+" : "+freq[i]);
	         }
	     }
	}
}
