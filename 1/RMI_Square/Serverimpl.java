import java.rmi.*;
import java.rmi.server.*;

public class Serverimpl extends UnicastRemoteObject implements Serverintf
{
	public Serverimpl() throws RemoteException{
	
	}

	public double getSquare(double num1) throws RemoteException
	{

		
		return num1 * num1 ;
		
	}
}
