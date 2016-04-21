// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Task1 {
	String checkRule(String string)
	{
		String s2, result="";
		switch(string)
		{
		 	case "AB": 
		 		result = "AA";		
		 		break;
		 	case "BA":  
		 		result = "AA";		
		 		break;
		 	case "CB": 
		 		result = "CC";		
		 		break;
		 	case "BC":  
		 		result = "CC";		
		 		break;
		 	case "AA":  
		 		result = "A";		
		 		break;
		 	case "CC":  
		 		result = "C";		
		 		break;
		}
		return result;
	}
	
	StringBuffer changeString(StringBuffer sb)
	{
		String result = sb.toString();
		int i = 0; int count = 0;
		while(sb.length()>1 && i<sb.length()-1)
		{
			count ++;
			result = checkRule(sb.substring(i, i+2));
			if(result!="")
			{
				sb.delete(i, i+2);
				sb.insert(i, result);
			}
			else
			{
				i = i+1;
			}

		}
		System.out.println(count);
		return sb;	
	}
	
	public String solution(String S) 
    {
        StringBuffer sb = new StringBuffer(S);
        sb = changeString(sb);
        return sb.toString();
        
    }
	
	public static void main(String args[]){
		long start = System.nanoTime();
		Task1 obj = new Task1();
		System.out.println(obj.solution("ABABABABABCC"));
		long end = System.nanoTime() - start;
		System.out.println("Time taken : " + end);
	}
}