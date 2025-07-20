package module1;
import java.util.*;

public class BigNum {

	public static void main(String[] args) {
		/** Author Name:Febin Farha
		 * Date:20-7-25
		 */
		Scanner sc=new Scanner(System.in);
		int n1,n2,bignum;
		System.out.println("Enter the first number:");
		n1=sc.nextInt();
		System.out.println("Enter the first number:");
		n2=sc.nextInt();
		bignum=n1>n2?n1:n2;
		System.out.println("Bignumber= "+bignum);
		
		
		

	}

}
