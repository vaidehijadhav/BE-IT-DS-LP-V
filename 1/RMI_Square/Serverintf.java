import java.rmi.*;


interface Serverintf extends Remote{

//Syntax for method declaration: access_specifier return_type method_name(arguments){return_Value}

	public double getSquare(double num1) throws RemoteException;
}
