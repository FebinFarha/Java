package module1;
import java.util.*;
public class Fibbonacci {

	public static void main(String[] args) {
		/** Author Name:Febin Farha
		 * Date:20-7-25
		 */
Scanner sc =new Scanner(System.in);

System.out.println("Enter the limit:");
int num=sc.nextInt();
int i=1;
int a=0,b=1;
System.out.println(a);
System.out.println(b);
while(i<=num) {
	int c=a+b;
	System.out.println(c);
	a=b;
	b=c;
	i++;
	}

	}

}
