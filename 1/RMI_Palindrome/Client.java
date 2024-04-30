import java.rmi.*;
import java.util.Scanner;

public class Client
{
	public static void main(String[] args)
    {
	Scanner sc = new Scanner(System.in);

	try{
		String serverURL = "rmi://localhost/Server";
		Serverintf serverintf = (Serverintf) Naming.lookup(serverURL);

		System.out.print("Enter String: ");
		String input = sc.next();


		
		System.out.println("The Original String is: " + input);

		
		System.out.println(" ------------------------------------- Results-------------");

		System.out.println("Square of the number is: " + serverintf.isPalindrome(input));
	   } catch(Exception e){

		System.out.println("Exception Occurred at Client!" + e.getMessage());

		}
     }
}


// javac *.java
// rmiregistry
// java Server
// java Client
