import java.rmi.*;

public interface MyInter extends Remote{
   public String display() throws RemoteException;
   
   int add(int number1, int number2) throws RemoteException;

   int subtract(int number1, int number2) throws RemoteException;

   double divide(double number1, double number2) throws RemoteException;

   int multiply(int number1, int number2) throws RemoteException;

} 

