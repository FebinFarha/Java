package module1;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		/** Author Name:Febin Farha
		 * Date:20-07-25
		 */
		Scanner sc=new Scanner(System.in);
		int i,prime=0;
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		for(i=2;i<num;i++) {
			if(num%i==0) {
				prime=1;
				break;
			}
		}
		if(prime==1) {
			System.out.println(num+" is not a prime number");
		}
		else {
			System.out.println(num+" is a prime number");
		}
	}

}
