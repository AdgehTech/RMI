import java.rmi.*;
import java.net.*;

public class MyClient {
	

	public static void main(String[] args) { 

		try {

			MyInter remoteObject = (MyInter) Naming.lookup("rmi://localhost:8020/MyClient");
			// MyInter remoteObject = (MyInter) Naming.lookup("rmi://10.18.51.29:8020/MyClient");
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