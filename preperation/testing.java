import java.util.*;  

public class testing{
    public static void main(String args[]){
        
        Map<String,String> map=new HashMap<String,String>();
        map.put("GBR","GREAT BRITAIN");
        map.put("IDN","INDONESIA");
        map.put("IND","INDIA");
        map.put("KER","KERALA");
        System.out.println("Enter your username: ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String us=map.get(username);
        System.out.println("COUNTRY NAME IS : "+us);
        
    }
}
