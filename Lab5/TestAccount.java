public class TestAccount
{
	public static void main (String[] args)
	{
		Account acc1 = new Account (1);
		Account acc2 = new Account (1, 500.00000);

		System.out.println(acc1);
		System.out.println(acc2);

		acc1.setBalance(500);
		acc2.setBalance(900);

		System.out.println("AC: " + acc1.getAccountNumber() + "  Bal: " + acc1.getBalance());
		System.out.println("AC: " + acc2.getAccountNumber() + "  Bal: " + acc2.getBalance());
	}
}