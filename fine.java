class fine
{
public static void main (String args[])
{
	int a=42;
	try
	{
	int l=args.length;
	int b=42/l;
	try
	{
	int d =40/(l-1);
	int c[]={1};
		c[90]=6;
	}
	catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array index out of bound");
		}
	}
		catch(ArithmeticException e)
		{
			System.out.println("division by 0");
		}
		finally
		{
			System.out.println("the end ");
		}
	}
}