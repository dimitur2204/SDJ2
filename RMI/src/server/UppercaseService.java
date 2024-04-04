package server;

import java.rmi.RemoteException;
import java.util.Locale;

public class UppercaseService implements Uppercase {
    @Override
    public String uppercase(String source) throws RemoteException {
        return source.toUpperCase(Locale.ROOT);
    }
}
