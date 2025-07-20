package module1;
import java.util.*;
public class Fact {

	public static void main(String[] args) {
		/** Author Name:Febin Farha
		 * Date:20-07-25
		 */
		Scanner sc =new Scanner(System.in);
		int i=1,fact=1;
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		while(i<=num) {
			fact=fact*i;
			i=i+1;
		}
		System.out.println("Factorial of "+num+" is "+fact);

	}

}
