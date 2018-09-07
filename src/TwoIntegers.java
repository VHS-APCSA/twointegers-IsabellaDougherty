public class TwoIntegers 
{
	private int numone;
	private int numtwo;
	
	public TwoIntegers()
	{
		numone = 0;
		numtwo = 0;
	}
	
	public TwoIntegers (int numone, int numtwo)
	{
		this.numone = numone;
		this.numtwo = numtwo;
	}
	
	public int getNumone()
	{
		return numone;
	}
	public void setNumone(int numone)
	{
		this.numone = numone;
	}
	public int getNumtwo()
	{
		return numtwo;
	}
	public void setNumtwo(int numtwo)
	{
		this.numtwo = numtwo;
	}
	public String arithmatic()
	{
		int add = numone + numtwo;
		int subtract = numone - numtwo;
		int multiply = numone * numtwo;
		double divide = (double)numone / numtwo;
		return numone + " + " + numtwo + " = " + add + ", " + numone + " - " +
				numtwo + " = " +  subtract + ", " + numone + " * " + numtwo + " = " 
		+ multiply + ", " + numone + " / " + numtwo + " = " + divide;
	}
	public double toDecimal()
	{
		double result = (double) numone / numtwo;
		return result;
	}
	public int larger()
	{
		if(numone > numtwo)
		{
			return numone;
		}
		if(numtwo > numone)
		{
			return numtwo;
		}
		else
		{
			return numone;
		}
	}
	
	public boolean even()
	{
		if((numone + numtwo) % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean multiple()
	{
		if(numone % numtwo == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
