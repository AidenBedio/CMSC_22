public class Account
{
	private int accountNumber;
	private double balance;
	private static int[] accountlist = new int[100];
	private static int count;

	public Account (int AccNum, double Bal)
	{
		for (int i = 0; i < accountlist.length; i++)
		{
			if (accountlist[i] == AccNum)
			{
				throw  new IllegalArgumentException ("Account Number already takem");
			}
		}

		accountlist[count] = AccNum;
		count++;

		this.accountNumber = AccNum;
		this.balance = Bal;
	}

	public Account (int AccNum)
	{
		this(AccNum, 0.00);
	}

	public int getAccountNumber ()
	{
		return this.accountNumber;
	}

	public double getBalance ()
	{
		return this.balance;
	}

	public void setBalance (double BaLance)
	{
		if (BaLance < 0)
		{
			throw  new IllegalArgumentException ("Can't Put negative Money");
		}
		this.balance = BaLance;
	}

	public void credit (double amount)
	{
		this.balance += amount;
	}

	public void debit (double amount)
	{
		if (this.balance >= amount)
		{
			this.balance -= amount;
		}
		else
		{
			System.out.println("Ammount Withdrawn Exceeds the Current Balance");
		}

	}

	public String toString ()
	{
		return String.format("AC no: %d, Balance: %.2f", accountNumber, balance);
	}
}