package bankapplication_sh;

public class MainClass {

	public static void main(String arg[])
	{
	Account account=new Account();
	System.out.println("you are inside account..");
	account.accountnumber(12);
    account.displaymodify();
	display();
	
	}

public static void display()
	{
	System.out.println("hello i'm inside dispaly...");
	}
}

