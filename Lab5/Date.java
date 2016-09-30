public class Date
{

	private int year;
	private int month;
	private int day;


	public Date ()
	{
		this.year = 1000;
		this.month = 1;
		this.day = 1;
	}

	public Date (int y, int m, int d)
	{
		setDate (y, m , d);
	}

	public int getYear ()
	{
		return this.year;
	}

	public int getMonth ()
	{
		
		return this.month;
	}

	public int getDay ()
	{
		
		return this.day;
	}

	public void setYear (int y)
	{	
		if (y < 1000 || y > 9999)
		{
			throw new IllegalArgumentException ("Year Specified is out of Range.");
		}

		this.year = y;
	}

	public void setMonth (int m)
	{
		if (m < 1 || m > 12)
		{
			throw new IllegalArgumentException ("Month Specified is out of Range.");
		}

		this.month = m;		
	}	

	public void setDay (int d)
	{
		if (this.month % 2 == 1)
		{
			if (d < 1 || d > 31)
			{
				throw new IllegalArgumentException ("Day Specified is out of Range.");
			}
		}

		else if (this.month == 2)
		{
			if (this.year % 4 == 0)
			{
				if (d < 1 || d > 29)
				{
					throw new IllegalArgumentException ("Day Specified is out of Range.");
				}
			}
			else
			{
				if (d < 1 || d > 28)
				{
					throw new IllegalArgumentException ("Day Specified is out of Range.");
				} 
			}
		}

		else
		{
			if (d < 1 || d > 30)
			{
				throw new IllegalArgumentException ("Day Specified is out of Range.");
			}
		}

		this.day = d;
	}

	public void setDate (int y, int m, int d)
	{
		setYear(y);
		setMonth(m);
		setDay(d);
	}

	public String toString ()
	{
		String date = String.format("%02d/%02d/%02d",this.day, this.month, this.year);
		return date;
	}
} 