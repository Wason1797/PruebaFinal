package multipleMessures;

public class ConvertToLower 
{
	public float Convert(String from, String to, float value)
	{
		switch (from) 
		{
		case "Km":			
			switch (to) 
			{
			case "Hm":
				return value/=10;				
			case "Dm":
				return value/=100;
			case "m":
				return value/=1000;				
			case "dm":
				return value/=10000;				
			case "cm":
				return value/=100000;				
			case "mm":				
				return value/=1000000;	
			default:
				break;
			}			
			break;
		case "Hm":
			switch (to) 
			{						
			case "Dm":
				return value/=10;
			case "m":
				return value/=100;				
			case "dm":
				return value/=1000;				
			case "cm":
				return value/=10000;				
			case "mm":				
				return value/=100000;	
			default:
				break;
			}	
			break;
		case "Dm":
			switch (to) 
			{
			case "m":
				return value=10;				
			case "dm":
				return value/=100;				
			case "cm":
				return value/=1000;				
			case "mm":				
				return value/=10000;	
			default:
				break;
			}	
			break;
		case "m":		
			switch (to) 
			{			
			case "dm":
				return value/=10;				
			case "cm":
				return value/=100;				
			case "mm":				
				return value/=1000;	
			default:
				break;
			}
			break;
		case "dm":
			switch (to) 
			{						
			case "cm":
				return value/=10;				
			case "mm":				
				return value/=100;	
			default:
				break;
			}		
			break;
		case "cm":
			if(to.equals("mm")) return value/=10;	
			break;
		default:
			break;
		}
		return Float.MIN_VALUE;
	}	
}
