import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class MyImpl extends UnicastRemoteObject implements MyInter {
    public MyImpl() throws RemoteException {
    }

    @Override
    public String display() throws RemoteException { 
        return "The calculator service is given remotely using Java Frame";
    }

    public static void main(String[] args) {
        new Calculator();
    }

}
