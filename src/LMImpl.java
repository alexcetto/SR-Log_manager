import tp.Message;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by josetarsitano on 04/05/2016.
 */
public class LMImpl extends tp.LMPOA {
    String theme;
    String moderator;
    ConcurrentHashMap messages;

    @Override
    public String theme() {
        return null;
    }

    @Override
    public String moderator() {
        return null;
    }

    @Override
    public boolean postMessage(Message m) {
        return false;
    }

    @Override
    public Message getMessage(String title) {
        return null;
    }

    @Override
    public boolean removeMessage(String title) {
        return false;
    }

    static public String sayHello() {
        return "Hello client";
    }

//Not a valide type for the file
        public void saveLogToServer(serfile inFile){

            try
            {
                FileInputStream inFile = new FileInputStream(inFile);
                ObjectInPutStream in = new ObjectInPutStream(inFile);
                //object need to be saved to file
                in.close();
                inFile.close();
            }
            catch(IOException i){
                i.printStackTrace();
                return;
            }
            catch(ClassNotFoundException c){
                System.out.println("Log Array Class not found");
                c.printStackTrace();
                return;
            }
            }
        }
}
