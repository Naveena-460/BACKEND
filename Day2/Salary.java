package hai;
import java.util.Scanner;
public class Salary {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter initialize salary:");
		double salary=obj.nextDouble();
		System.out.println("The initialize salary:"+salary);
		salary+=4000;
		System.out.println("Update salary using += operator:"+salary);
		salary-=4000;
		System.out.println("Update salary using -= operator:"+salary);
		salary*=5000;
		System.out.println("Update salary using *= operator:"+salary);
		salary/=2000;
		System.out.println("Update salary using /= operator:"+salary);

	}

}
