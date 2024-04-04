package login.server;

import login.shared.Login;

import java.rmi.RemoteException;

public class LoginImplementation implements Login {
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin";
    public boolean login(String username, String password) throws RemoteException {
        return USERNAME.equals(username) && PASSWORD.equals(password);
    }
}
