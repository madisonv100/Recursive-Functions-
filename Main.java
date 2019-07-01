import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in) ;
	System.out.println("please enter a number:");
	int current = scan.nextInt();
	System.out.println(getfact(current));
//	System.out.println("please enter a number1:");
//	int num1 = scan.nextInt();
//	System.out.println("please enter a number2:");
//	int num2 = scan.nextInt();
//	System.out.println(getGCD(num1,num2));
	
	}


static int getfact(int current)
{
	if (current==1)
	{
		return 1;
		
	}
	else
	{
		current = getfact(current-1)*current;
				return current;
		
	}
}

static int getGCD(int num1, int num2)
{
	if (num2 == 0)
	{
		return num1;
		
	}
	else 
	{
		return getGCD(num2, num1%num2);
	
		
	}
}

}