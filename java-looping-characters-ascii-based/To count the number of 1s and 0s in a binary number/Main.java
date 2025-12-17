import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String binary = sc.next();
	    int count0 = 0,count1 = 0;
	    for(int i=0 ; i < binary.length() ; i++){
	        if(binary.charAt(i)=='0')count0++;
	        else   count1++;
	    }System.out.println("count '0': "+count0+"\ncount '1': "+count1 );
	    
	}
}
