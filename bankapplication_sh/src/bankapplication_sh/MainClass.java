package bankapplication_sh;

public class MainClass {

	public static void main(String arg[])
	{
		System.out.println("WELCOME TO REMOTE COMMIT");
	Account account=new Account();
	System.out.println("you are inside account..");
	account.accountnumber(12);
    account.displaymodify();
    account.accountreg(12);
	display();
	
	}

public static void display()
	{
	System.out.println("hello i'm inside dispaly...");
	}
}

