package hai;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Age:");
		int age=obj.nextInt();
		if(age>=18&&age<=60)
		{
			System.out.println("Valid Age");
		}
		else
		{
			System.out.println("Invalid age");
			
		}

	}

}
