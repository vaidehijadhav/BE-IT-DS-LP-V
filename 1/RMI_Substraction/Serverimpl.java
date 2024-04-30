import java.rmi.*;
import java.rmi.server.*;

public class Serverimpl extends UnicastRemoteObject implements Serverintf
{
	public Serverimpl() throws RemoteException{
	
	}

	public double subtraction(double num1, double num2) throws RemoteException
	{

		return num1 - num2;
	}
}
