package login.server;

import server.UppercaseService;

import java.rmi.Remote;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class LoginServer {
    public static void main(String[] args) throws Exception {
        Registry registry = LocateRegistry.createRegistry(1099); // Create registry instead
        LoginImplementation login = new LoginImplementation();
        Remote remote = UnicastRemoteObject.exportObject(login, 8888); // Create server stub instead
        registry.bind("login", remote);
        // Bind name to registry here
        System.out.println("Server running");
    }
}
