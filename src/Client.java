import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import tp.LM;
import tp.LMHelper;

/**
 * Created by josetarsitano on 04/05/2016.
 */
public class Client {
    static LM LgManagerImpl;

    public static void main(String args[]) {
        try {
            ORB orb = ORB.init(args, null);

            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            String name = "LM";
            LgManagerImpl = LMHelper.narrow(ncRef.resolve_str(name));

            System.out.println(LMImpl.sayHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("LMClient exiting...");
    }
}
