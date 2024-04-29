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

            System.out.println("Enter a number:");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());

            // Calling the check_odd_even method
            String result = ReverseImpl.check_odd_even(num);
            System.out.println(result);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}


//   idlj -fall  ReverseModule.idl
//    javac *.java  ReverseModule/*.java
// orbd -ORBInitialPort 1050&
//   java ReverseServer -ORBInitialPort 1050& -ORBInitialHost localhost&




// New Terminal -->   java ReverseClient -ORBInitialPort 1050 -ORBInitialHost localhost