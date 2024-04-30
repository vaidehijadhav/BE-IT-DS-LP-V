import java.rmi.*;
import java.util.Scanner;

public class Client
{
	public static void main(String[] args)
    {
	Scanner sc = new Scanner(System.in);

	try
	{
		String serverURL = "rmi://localhost/Server";
		Serverintf serverintf = (Serverintf) Naming.lookup(serverURL);

           	 System.out.print("Enter the first string: ");
           	 String str1 = sc.nextLine();

            	System.out.print("Enter the second string: ");
            	String str2 = sc.nextLine();
		
		boolean isEqual = serverintf.compareStrings(str1, str2);
		
            	if (isEqual) {
                	System.out.println("The strings are equal.");
            	} else {
                System.out.println("The strings are not equal.");
            	}
	   } catch(Exception e){

		System.out.println("Exception Occurred at Client!" + e.getMessage());

		}
     }
}


// javac *.java
// rmiregistry
// java Server
// java Client
