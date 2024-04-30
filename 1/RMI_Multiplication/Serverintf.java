import java.rmi.*;


interface Serverintf extends Remote{

//Syntax for method declaration: access_specifier return_type method_name(arguments){return_Value}

	public double multiplication (double num1, double num2) throws RemoteException;
}
