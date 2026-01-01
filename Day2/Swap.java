package hai;
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
	    System.out.println("Enter a:");
	    int a=obj.nextInt();
	     
	    System.out.println("Enter b:");
	    int b=obj.nextInt();
	    
	    a=a+b;
	    b=a-b;
	    a=a-b;
	    
	    System.out.println("Ater Swapping");
	    System.out.println("a="+a);
	    System.out.println("b="+b);
	}

}
