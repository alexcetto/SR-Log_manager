import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

import java.util.ArrayList;

/**
 * Created by josetarsitano on 04/05/2016.
 */
public class GAServer {
    // List of IP address
    ArrayList<String> IPTable;
    // Number of Host by sup-network
    int nbHost;
    // ID Sub-network
    int IDSN;

    public static void main(String args[]) {
        try {
            ORB orb = ORB.init(args, null);

            POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootpoa.the_POAManager().activate();

            LMImpl fImpl = new LMImpl();

            org.omg.CORBA.Object ref = rootpoa.servant_to_reference(fImpl);

            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            String name = "LM";
            NameComponent path[] = ncRef.to_name(name);
            ncRef.rebind(path, ref);

            System.out.println("LMServer ready and waiting...");

            orb.run();
            /*while (true) {

            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("LMServer exiting...");
    }

    private void buildIPTable() {

    }
}
