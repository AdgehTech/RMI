import java.rmi.*;

public interface MyInter extends Remote{
   public String display() throws RemoteException; 
} 

