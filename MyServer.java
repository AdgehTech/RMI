import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;


public class MyServer {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(8020);
            MyImpl localObj = new MyImpl();
            registry.rebind("MyClient", localObj);
        } catch (RemoteException re) {
            re.printStackTrace();
        }
    }
}
