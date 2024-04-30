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

		System.out.print("Enter First Number: ");
		double num1 = sc.nextDouble();


		
		System.out.println("The Number is: " + num1);

		
		System.out.println(" ------------------------------------- Results-------------");

		System.out.println("Square of the number is: " + serverintf.getSquare(num1));
	   } catch(Exception e){

		System.out.println("Exception Occurred at Client!" + e.getMessage());

		}
     }
}


// javac *.java
// rmiregistry
// java Server
// java Client