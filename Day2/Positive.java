package hai;
import java.util.Scanner;
public class Positive {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
	System.out.println("Enter the number:");
	
	int num=obj.nextInt();
	if(num>0)
	{
       System.out.println("The number is positive");
	}
	
	else if(num<0)
	{
		System.out.println("The number is negative");
	}
	else if(num==0)
	{
		System.out.println("The number is zero");
	}

}
}