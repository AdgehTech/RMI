import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class MyImpl extends UnicastRemoteObject implements MyInter {
    public MyImpl() throws RemoteException {
    }

    @Override
    public String display() throws RemoteException {
        // new Calculator();
        return "The calculator service is given remotely using Java Frame";
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public int add(int number1, int number2) throws RemoteException {
        // TODO Auto-generated method stub
        System.out.println("From remote object");
        return number1 + number2;
    }

    @Override
    public int subtract(int number1, int number2) throws RemoteException {
        // TODO Auto-generated method stub
        System.out.println("From remote object");
        return number1 - number2;
    }

    @Override
    public double divide(double number1, double number2) throws RemoteException {
        // TODO Auto-generated method stub
        System.out.println("From remote object");
        return number1 / number2;
    }

    @Override
    public int multiply(int number1, int number2) throws RemoteException {
        // TODO Auto-generated method stub
        System.out.println("From remote object");
        return number1 * number2;
    }
}
