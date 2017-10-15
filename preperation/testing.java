import java.util.*;  

public class testing{
    public static void main(String args[]){
        
        Map<String,String> map=new HashMap<String,String>();
        map.put("GBR","GREAT BRITAIN");
        map.put("IDN","INDONESIA");
        map.put("IND","INDIA");
        map.put("KER","KERALA");
        System.out.println("ENTER COUNTRY CODE: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
	int len = username.length();
	if(len == 3)
	{
	        String us=map.get(username);
		if(us != null)
		{
			 System.out.println("COUNTRY NAME IS : "+us);
		}
		else
		{
			System.out.println("NO SUCH KEY");
		}
	}
	else
	{
		int flag=0;
		Set keys = map.keySet();
  		for (Iterator i = keys.iterator(); i.hasNext(); ) 
		{
       			String key = (String) i.next();
       			String value = (String) map.get(key);
       			if(value.equals(username))
			{
				System.out.println("CODE IS ="+key);
				flag=1;	
			}
   		}
		if(flag!=1)
			System.out.println("NO SUCH COUNTRY");
	}
        
    }
}
