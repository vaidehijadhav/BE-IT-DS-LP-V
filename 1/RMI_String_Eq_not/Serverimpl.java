import java.rmi.*;
import java.rmi.server.*;

public class Serverimpl extends UnicastRemoteObject implements Serverintf
{
	public Serverimpl() throws RemoteException{
		   super();
	}
		
	@Override
    	public boolean compareStrings(String str1, String str2) throws RemoteException {
        return str1.equals(str2);
    }
		
}

