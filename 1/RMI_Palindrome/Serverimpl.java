import java.rmi.*;
import java.rmi.server.*;

public class Serverimpl extends UnicastRemoteObject implements Serverintf
{
	public Serverimpl() throws RemoteException{
	
	}

	public boolean isPalindrome(String str) throws RemoteException
	{

		String reverse = new StringBuilder(str).reverse().toString();
		return str.equals(reverse);
		
	}
}
