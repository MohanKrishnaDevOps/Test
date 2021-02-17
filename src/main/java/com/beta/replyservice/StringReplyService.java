import java.util.*;  
import java.math.BigInteger; 
import java.security.MessageDigest; 
import java.security.NoSuchAlgorithmException;

public class StringReplyService 
{
	public static String reverseString(String input)
	{  
		StringBuilder sb=new StringBuilder(input);  
		sb.reverse();  
		return sb.toString();  
	}
	public static String getMd5(String input) 
	{ 
		try 
		{  
			MessageDigest md = MessageDigest.getInstance("MD5"); 
			byte[] messageDigest = md.digest(input.getBytes());  
			BigInteger no = new BigInteger(1, messageDigest); 
			String hashtext = no.toString(16); 
			while (hashtext.length() < 32) 
			{ 
				hashtext = "0" + hashtext; 
			} 
			return hashtext; 
		} 

		catch (NoSuchAlgorithmException e) 
		{ 
			throw new RuntimeException(e); 
		} 
	}
	//Main
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		while(true)
		{
			System.out.println("String is kbzw9ru");
			System.out.println("1. /reply/kbzw9ru");
			System.out.println("2. reverse the string");
			System.out.println("3. encode the string via MD5 hash algorithm");
			System.out.println("4. /reply/11-kbzw9ru");
			System.out.println("5. /reply/12-kbzw9ru");
			int a= sc.nextInt();  
			if(a == 1)
			{  
				System.out.println("String is kbzw9ru"); 
			}else if(a == 2)
			{  
				System.out.println("reverse the string is " + reverseString("kbzw9ru"));  
			}  
			else if(a == 3)
			{  
				System.out.println("encode the string via MD5 hash algorithm    " + getMd5("kbzw9ru"));  
			}    
			else if(a == 4)
			{  
				System.out.println("String is kbzw9ru");
			} 
			else if(a == 5)
			{  
				System.out.println("/reply/11-kbzw9ru" + getMd5(reverseString("kbzw9ru")));
			} 
			else 
			{  
				System.out.println("Please select correct option");
				continue;
			} 
			System.out.println("Do you want to continue?");
			System.out.println("if yes - y  no - n");
			String str= sc.nextLine(); 
			if(str == "y" || str == "Y")
			{
				continue;
			}else if(str == "n" || str == "N") 
			{
				break;
			}else
			{
				break;
			}
		}
	}
}