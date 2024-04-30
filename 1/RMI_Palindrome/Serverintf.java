import java.rmi.*;


interface Serverintf extends Remote{

//Syntax for method declaration: access_specifier return_type method_name(arguments){return_Value}

	public boolean isPalindrome (String str) throws RemoteException;
}
