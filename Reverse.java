package module1;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		/** Author Name:Febin Farha
		 * Date:20-7-25
		 */
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int x=num;
		int rev=0,i;
		for(i=1;i<=num;i++) {
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println("Reverse of "+x+" is:"+rev);
  }
}
