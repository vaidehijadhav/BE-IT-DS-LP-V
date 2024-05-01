import ReverseModule.*;
import org.omg.CosNaming.*;
import org.omg.CosNaming.NamingContextPackage.*;
import org.omg.CORBA.*;
import java.io.*;

class ReverseClient
{
    
    public static void main(String args[])
    {
        Reverse ReverseImpl=null;
        
        try
        {
            // initialize the ORB
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);

            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
            
            String name = "Reverse";
            ReverseImpl = ReverseHelper.narrow(ncRef.resolve_str(name));

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter first number:");
            double num1 = Double.parseDouble(br.readLine());

            System.out.println("Enter second number:");
            double num2 = Double.parseDouble(br.readLine());

            double sum = ReverseImpl.add(num1, num2);
            double difference = ReverseImpl.subtract(num1, num2);
            double product = ReverseImpl.multiply(num1, num2);
            double quotient = ReverseImpl.divide(num1, num2);

            // Print results
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}




//   idlj -fall  ReverseModule.idl
//   javac *.java  ReverseModule/*.java
//   orbd -ORBInitialPort 1050&
//   java ReverseServer -ORBInitialPort 1050& -ORBInitialHost localhost&

// New Terminal -->   java ReverseClient -ORBInitialPort 1050 -ORBInitialHost localhost