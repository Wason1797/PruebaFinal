package multipleMessures;

public class ConvertToUpper
{
	public float Convert(String from, String to, float value)
	{
		switch (from) 
		{
		case "mm":			
			switch (to) 
			{
			case "cm":
				return value*=10;				
			case "dm":
				return value*=100;
			case "m":
				return value*=1000;				
			case "Dm":
				return value*=10000;				
			case "Hm":
				return value*=100000;				
			case "Km":				
				return value*=1000000;	
			default:
				break;
			}			
			break;
		case "cm":
			switch (to) 
			{						
			case "dm":
				return value*=10;
			case "m":
				return value*=100;				
			case "Dm":
				return value*=1000;				
			case "Hm":
				return value*=10000;				
			case "Km":				
				return value*=100000;	
			default:
				break;
			}	
			break;
		case "dm":
			switch (to) 
			{
			case "m":
				return value*=10;				
			case "Dm":
				return value*=100;				
			case "Hm":
				return value*=1000;				
			case "Km":				
				return value*=10000;	
			default:
				break;
			}	
			break;
		case "m":		
			switch (to) 
			{			
			case "Dm":
				return value*=10;				
			case "Hm":
				return value*=100;				
			case "Km":				
				return value*=1000;	
			default:
				break;
			}
			break;
		case "Dm":
			switch (to) 
			{	
					
			case "Hm":
				return value*=10;				
			case "Km":				
				return value*=100;	
			default:
				break;
			}		
			break;
		case "Hm":
			if(to.equals("Km")) return value*=10;	
			break;
		default:
			break;
		}
		return Float.MIN_VALUE;
	}	
}
