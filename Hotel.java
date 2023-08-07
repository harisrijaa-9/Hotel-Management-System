package tube;
import java.util.*;
public class hotel {
	public static void main(String[] args) { // TODO Auto-generated method stub

int qty,amt,bill=0,i;
		Scanner in=new Scanner(System.in);

	
		System.out.println("Mini tech hacker ");
		do {
		System.out.println("1. Dosa"); 

		System.out.println("2. sambar");

		System.out.println("3. Appam");
		System.out.println("4.idli");

		System.out.println("5.vada"); 
		System.out.println("what is your choice");

		int ch=in.nextInt();

		switch(ch)

		{ 
		case 1:
		

		System.out.println("dosa qty?");
		qty=in.nextInt();
		amt=qty*10;

		
		bill=bill+amt;

		break;

		case 2:

		System.out.println("sambar qty?"); 
		qty=in.nextInt(); 
		

		amt=qty*20;
		bill=bill+amt;
		break;

		case 3:

		System.out.println("Appam qty?"); 
		qty=in.nextInt();

		amt=qty*30;
		bill=bill+amt;

		break;
		case 4:

		System.out.println("idli qty?");

		qty=in.nextInt();

		amt=qty*5;

		bill=bill+amt;

		break;

		case 5:

		System.out.println("vada qty?");

		qty=in.nextInt(); 
		amt=qty*5; 
		bill=bill+amt;

		break;

		default: 
			System.out.println(" sry, invalid food so choice valid food!"); 
			break;
		}
		System.out.println("you want con..press 1 or press 0");

		i=in.nextInt();

	}
	while(i==1);

		System.out.println("your total bill is?"+bill);
		
}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
