import java.rmi.*;
import java.net.*;

public class MyClient {
	

	public static void main(String[] args) { 

		try {

			// for between two pc's
			// we take the IP address of our server	
			// to disable the below comment you have to change the IP address with your server IP
			// MyInter remoteObject = (MyInter) Naming.lookup("rmi://10.18.51.29:8020/MyClient");

			// for localy, within our single pc
			MyInter remoteObject = (MyInter) Naming.lookup("rmi://localhost:8020/MyClient");
			System.out.println(remoteObject.display());
			new Calculator();
			
		} catch (RemoteException re) {
			re.printStackTrace();
		} catch (NotBoundException nbe) {
			nbe.printStackTrace();
		} catch (MalformedURLException mfe) {
			mfe.printStackTrace();
		}

	}
}