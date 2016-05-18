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

//not the right type
    public void prepareLog(LogArray log){
        try{
            FileOutPutStrem fileOut = new FileOutPutStrem("RelaiLog.ser");
            ObjectOutPutStream out = new ObjectOutPutStream(fileOut);
            out.WriteObject(log);
            out.close();
            System.out.printf("Client log saved to Server log");
        }
        catch(IOException i){
            i.printStackTrace();        
        }
        return fileOut;
    }

    public static void main(String args[]) {
        try {
            ORB orb = ORB.init(args, null);

            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            String name = "LM";
            LgManagerImpl = LMHelper.narrow(ncRef.resolve_str(name));
               public void saveLog(Log log){
        try{
            FileOutPutStrem fileOut = new FileOutPutStrem("RelaiLog.ser");
            ObjectOutPutStream out = new ObjectOutPutStream(fileOut);
            out.WriteObject(log);
            out.close();
            System.out.printf("Client log saved to Server log");
        }
        catch(IOException i){
            i.printStackTrace();        
        }
        return;

            LgManagerImpl.saveLogToServer(/*file deserializedFile: RelaiLog.ser*/);

            System.out.println(LMImpl.sayHello());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("LMClient exiting...");
    }
}
