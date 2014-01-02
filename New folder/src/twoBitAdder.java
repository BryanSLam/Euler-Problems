//Given two strings that are two bit inputs, return the string that corresponds to the sum of the inputs
//Use as little conditionals as possible

public class twoBitAdder {
	private String x;
	private String y;
	private boolean carry;
	public twoBitAdder(String input1, String input2)
	{
		//Add leading zeros
		if(input1.length()<2)
		{
			input1 = "0" + input1;
		}
		if(input2.length()<2)
		{
			input2 = "0" + input2;
		}
		x = input1;
		y = input2;
		carry = false;
	}
	
	public String start()
	{
		//parse bit by bit
		//string is an array of chars
		String output = "";
		for (int i = x.length()-1; i>=0; i--)
		{
			char a = x.charAt(i);
			int n = Character.getNumericValue(a);
			char b = y.charAt(i);
			int m = Character.getNumericValue(b);
			int x= 0;
			if(carry == true)
			{
				x = 1;
			}
			else
			{
				x = 0;
			}
			
			if(n+m+x == 3)
			{
				carry = true;
				output = '1' + output;
			}
			else
				{
					if(n+m+x == 2)			
					{
						carry = true;
						output = '0' + output;
					}
					else
					{
						if(carry == true)
						{
							carry =false;
						}
						output = Integer.toString(n+m+x) + output;
					}
				}

		}
		if(carry == true)
		{
			output = '1'+output;
		}
		//Still ended up using a ton of if statements
		return output;
	}

}
