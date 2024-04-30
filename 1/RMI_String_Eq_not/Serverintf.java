import java.rmi.*;


interface Serverintf extends Remote{

//Syntax for method declaration: access_specifier return_type method_name(arguments){return_Value}

	  boolean compareStrings(String str1, String str2) throws RemoteException;
}
