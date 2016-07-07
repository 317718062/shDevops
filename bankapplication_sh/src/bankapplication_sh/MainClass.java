package bankapplication_sh;

public class MainClass {

	public static void main(String arg[])
	{
	Account account=new Account();
	account.accountnumber(12);
	System.out.println("you r inside account..");
	display();
	
	}

public static void display()
	{
	System.out.println("hello i'm inside dispaly...");
	}
}

