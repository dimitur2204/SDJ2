package login.shared;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Login extends Remote {
  // Add methods from the diagram here.
    boolean login(String username, String password) throws RemoteException;
}
