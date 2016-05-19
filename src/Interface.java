package ;
import Remote;
import RemoteException;


//not really how it works any more...
public interface MachineRelaiInterface extends Remote{
	public void saveLogToServer(file serFile) throws RemoteException{
	}

	  public String theme() {
    }

    public String moderator() {
    }

    public boolean postMessage(Message m) {
    }

    public Message getMessage(String title) {
    }

    public boolean removeMessage(String title) {
    }

    static public String sayHello(){
    }
}

