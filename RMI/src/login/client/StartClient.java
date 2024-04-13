package login.client;

import login.shared.Login;

import java.io.IOException;
import java.rmi.NotBoundException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class StartClient {
    public static void main(String[] args) throws IOException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry("localhost", 1099); // get the registry instead
        Login client = (Login) registry.lookup("login"); // get the uppercase.client from the registry instead
        boolean login = client.login("admin", "admin");
        System.out.println(login);
    }
}
