package bankapplication_sh;

public class Account {
	int[] acc={1,2,3,4,5};
	int accno;
	public int accountnumber(int accno)
	{
		return accno;
	}
	public void displaymodify()
	{
		System.out.println("inside display class in account");
	for(int i=0;i<acc.length;i++)
	{
		System.out.println("data"+i);
	}
	}
	
}
